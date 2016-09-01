package com.bfil.automapper

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

trait Mapping[A, B] {
  def map(a: A): B
}

object Mapping {

  implicit def materializeMapping[A, B]: Mapping[A, B] = macro materializeMappingImpl[A, B]

  def materializeMappingImpl[A: c.WeakTypeTag, B: c.WeakTypeTag](c: Context): c.Expr[Mapping[A, B]] = {
    import c.universe._
    materializeDynamicMappingImpl[A, B](c)(c.Expr(reify(DynamicMapping.empty).tree))
  }

  def materializeDynamicMappingImpl[A: c.WeakTypeTag, B: c.WeakTypeTag](c: Context)(dynamicMapping: c.Expr[A => DynamicMapping]): c.Expr[Mapping[A, B]] = {
    import c.universe._

    val sourceType = weakTypeOf[A]
    val targetType = weakTypeOf[B]
    val targetCompanion = targetType.typeSymbol.companion

    val dynamicParams = dynamicMapping.tree.collect {
      case arg @ Apply(TypeApply(Select(Select(Ident(scala), tuple2), TermName("apply")), List(TypeTree(), TypeTree())), List(Literal(Constant(key: String)), impl)) => arg
    }

    def getFirstTypeParam(tpe: Type) = { val TypeRef(_, _, tps) = tpe; tps.head }
    def getSecondTypeParam(tpe: Type) = { val TypeRef(_, _, tps) = tpe; tps.tail.head }

    def isOptionSymbol(typeSymbol: Symbol) = typeSymbol == typeOf[Option[_]].typeSymbol
    def isCaseClassSymbol(typeSymbol: Symbol) = typeSymbol.isClass && typeSymbol.asClass.isCaseClass
    def isIterableType(tpe: Type): Boolean = tpe.baseClasses.contains(typeOf[Iterable[_]].typeSymbol) && !isMapType(tpe)
    def isMapType(tpe: Type): Boolean = tpe.baseClasses.contains(typeOf[Map[_, _]].typeSymbol)

    def getFields(tpe: Type): List[FieldInfo] =
      tpe.decls.collectFirst {
        case m: MethodSymbol if m.isPrimaryConstructor => m
      }.get.paramLists.head.map(FieldInfo(_))

    case class FieldInfo(field: Symbol) {
      lazy val term = field.asTerm
      lazy val termName = term.name
      lazy val key = termName.decodedName.toString
      lazy val tpe = term.typeSignature
      lazy val typeSymbol = tpe.typeSymbol
      lazy val isCaseClass = isCaseClassSymbol(typeSymbol)
      lazy val isOptional = isOptionSymbol(typeSymbol)
      lazy val isOptionalCaseClass = isOptional && isCaseClassSymbol(getFirstTypeParam(tpe).typeSymbol)
      lazy val isIterable = isIterableType(tpe)
      lazy val isIterableCaseClass = isIterable && isCaseClassSymbol(getFirstTypeParam(tpe).typeSymbol)
      lazy val isMap = isMapType(tpe)
      lazy val companion = typeSymbol.companion
      lazy val firstTypeParamCompanion =
        if (isOptional || isIterable) getFirstTypeParam(tpe).typeSymbol.companion
        else throw new NoSuchElementException(s"$key is of type $tpe and does not have a type parameter")
      lazy val secondTypeParamCompanion =
        if (isMap) getSecondTypeParam(tpe).typeSymbol.companion
        else throw new NoSuchElementException(s"$key is of type $tpe and does not have a second type parameter")
    }

    def extractParams(sourceType: Type, targetType: Type, parentFields: List[FieldInfo], isRoot: Boolean = true): List[Tree] = {

      val sourceFields = getFields(sourceType)
      val targetFields = getFields(targetType)

      targetFields.map { targetField =>

        val sourceFieldOption = sourceFields.find(_.key == targetField.key)

        val targetFieldLiteral = Literal(Constant(targetField.key))
        val dynamicField = dynamicParams.find(term => term.children(1).equalsStructure(targetFieldLiteral))

        if (dynamicField.isDefined && isRoot) AssignOrNamedArg(Ident(targetField.termName), q"dynamicMapping.${targetField.termName}")
        else if (sourceFieldOption.isDefined) {

          val sourceField = sourceFieldOption.get

          val fieldSelector = (parentFields ++ List(sourceField)).foldLeft(Ident(TermName("a")): Tree) {
            case (tree, field) => Select(tree, field.termName)
          }

          val sourceAndTargetHaveDifferentTypes = sourceField.tpe != targetField.tpe ||
            (sourceField.isMap && getSecondTypeParam(sourceField.tpe) != getSecondTypeParam(targetField.tpe))

          val value = {
            if (sourceAndTargetHaveDifferentTypes &&
              (sourceField.isCaseClass || sourceField.isOptionalCaseClass || sourceField.isIterableCaseClass || sourceField.isMap)) {

              if (sourceField.isOptionalCaseClass || sourceField.isIterableCaseClass) {
                val params = extractParams(getFirstTypeParam(sourceField.tpe), getFirstTypeParam(targetField.tpe), List.empty, false)
                val value = q"${targetField.firstTypeParamCompanion.asTerm.name}(..$params)"

                val lambda = Apply(Select(fieldSelector, TermName("map")),
                  List(Function(List(ValDef(Modifiers(Flag.PARAM), TermName("a"), TypeTree(), EmptyTree)), value)))

                q"$lambda"
              } else if (sourceField.isMap) {
                val params = extractParams(getSecondTypeParam(sourceField.tpe), getSecondTypeParam(targetField.tpe), List.empty, false)
                val value = q"${targetField.secondTypeParamCompanion.asTerm.name}(..$params)"

                val lambda = Apply(Select(fieldSelector, TermName("mapValues")),
                  List(Function(List(ValDef(Modifiers(Flag.PARAM), TermName("a"), TypeTree(), EmptyTree)), value)))

                q"$lambda"
              } else {
                val params = extractParams(sourceField.tpe, targetField.tpe, parentFields :+ sourceField, false)
                q"${targetField.companion.asTerm.name}(..$params)"
              }

            } else fieldSelector
          }

          q"${targetField.termName} = $value"
        } else {
          def namedAssign(value: Tree) = AssignOrNamedArg(Ident(targetField.termName), value)

          if (targetField.isOptional) namedAssign(q"None")
          else if (targetField.isIterable) namedAssign(q"${targetField.companion}.empty")
          else if (targetField.isMap) namedAssign(q"Map.empty")
          else EmptyTree
        }
      }.filter(p => !p.isEmpty)
    }

    val params = extractParams(sourceType, targetType, List.empty)

    def generateMappingCode() =
      if (dynamicParams.length > 0) q"val dynamicMapping = $dynamicMapping(a); ${targetCompanion.asTerm.name}(..$params)"
      else q"${targetCompanion.asTerm.name}(..$params)"

    def generateCode() =
      q"""
        import com.bfil.automapper.Mapping
        new Mapping[$sourceType, $targetType] {
          def map(a: $sourceType): $targetType = {
            ${generateMappingCode()}
          }
        }
      """

    c.Expr[Mapping[A, B]](generateCode())
  }
}

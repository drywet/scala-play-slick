import play.api.data.validation.Constraint
import play.api.libs.json.Json

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

class A {
  val a = 123
}
/*class AA {
  val ab = 123
}*/
trait T extends A {
  val t = 321
  override val a = 111
}
trait TT extends T {
  //val t = 3211
  override val a = 12312
}

/*trait TT extends AA {
  val tb = 321
}*/
class B extends A with T with TT /*with TT*/ {
  val aa = a
  val tt = t
}
new B().aa

//Optional <=> Not optional
case class AllFields(a: Int, b: String, c: Option[String])

case class SomeFields1(a: Option[Int], b: String, c: String)


class ValidationResult[T](errors: Seq[String]) {
  //TODO errors is not a String but Error
  def toErrorString = errors.mkString(", ")
}

/*abstract class Constraint[F] {
  def check(field: F): Either[Unit, Unit]

  def and(other: Constraint[F]) = {
    new Constraint[F] {
      override def check(field: F): Either[Unit, Unit] = this.check(field).right.flatMap(_ => other.check(field))
    }
  }
}

object Constraint {
  //Json
  def min[F<:Int](min: Int) = new Constraint[F] {
    override def check(field: F): Either[Unit, Unit] = field.
  }
}*/

class Validator[T](f: T => ValidationResult[T]) {
  def validate(x: T) = f(x)

  def check[F](field: F)(constraint: Constraint[F]) = {
    val fieldName = "123" // TODO macro magic
    constraint(field) //add field name to error

  }
}

//import play.api.libs.functional.syntax._
//import play.api.libs.json.Reads._

object Validator {
  def of[T](f: T => ValidationResult[T]): Validator[T] = new Validator[T](f)
}

/*implicit val allFieldsValidator = Validator.of[AllFields] { x =>
  check(x.a)(min(1) and max(200) and minLength(10) and maxLength(100)) //min for numbers, minLength for implicit Traversable
  null
}*/

//
import scala.concurrent.ExecutionContext.Implicits.global
val fff = Future(1234)
val fffa = fff.map(a => a*2)
val fffb = fff.map(a => a/2)
Await.result(fffa, Duration.Inf)
Await.result(fffb, Duration.Inf)

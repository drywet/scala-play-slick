import scala.reflect.internal.util.StringOps
object FlattenGenerator {
  def gen(n: Int) = {
    val generic = 1 to n map {i => s"T$i"} mkString ", "
    val tupleLeft = "(" * (n-1)
    val tupleRight = 2 to n map {i => s", T$i)"} mkString ""
    val tuple = tupleLeft + "T1" + tupleRight
    val mapping = n-1 to 0 by -1 map { i =>
      val postfix = if (i == n-1) "" else "._2"
      "t" + "._1" * i + postfix
    } mkString ", "
    s"""
       |  def flatten[$generic](t: $tuple) = ($mapping)
   """.stripMargin
  }
  3 to 8 map { i =>
    gen(i)
  } mkString ""
}
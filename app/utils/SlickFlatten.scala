package utils

/** Auto-generated
  * The purpose of these methods is to convert chain of N nested Tuple2, which is result of N joins, to single TupleN
  *
  * @see FlattenGenerator
  */

object SlickFlatten {
  def flatten3[T1, T2, T3](t: ((T1, T2), T3)) = (t._1._1, t._1._2, t._2)

  def flatten4[T1, T2, T3, T4](t: (((T1, T2), T3), T4)) = (t._1._1._1, t._1._1._2, t._1._2, t._2)

  def flatten5[T1, T2, T3, T4, T5](t: ((((T1, T2), T3), T4), T5)) = (t._1._1._1._1, t._1._1._1._2, t._1._1._2, t._1._2, t._2)

  def flatten6[T1, T2, T3, T4, T5, T6](t: (((((T1, T2), T3), T4), T5), T6)) = (t._1._1._1._1._1, t._1._1._1._1._2, t._1._1._1._2, t._1._1._2, t._1._2, t._2)

  def flatten7[T1, T2, T3, T4, T5, T6, T7](t: ((((((T1, T2), T3), T4), T5), T6), T7)) = (t._1._1._1._1._1._1, t._1._1._1._1._1._2, t._1._1._1._1._2, t._1._1._1._2, t._1._1._2, t._1._2, t._2)

  def flatten8[T1, T2, T3, T4, T5, T6, T7, T8](t: (((((((T1, T2), T3), T4), T5), T6), T7), T8)) = (t._1._1._1._1._1._1._1, t._1._1._1._1._1._1._2, t._1._1._1._1._1._2, t._1._1._1._1._2, t._1._1._1._2, t._1._1._2, t._1._2, t._2)

}
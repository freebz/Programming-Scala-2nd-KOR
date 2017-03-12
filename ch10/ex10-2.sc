// 10.3 Nothing(그리고 Null)에 대한 더 많은 내용

package scala
abstract final class Null extends AnyRef


package scala
abstract final class Nothing extends Any


package scala.collection.immutable
object Nil extends List[Nothing] with Product with Serializable


package scala
object Predef {
  ...
  def ???: Nothing = throw new NotImplementedError
  ...
}


def m(l: List[Int]): List[Int] = l map (i => ???)
// m: (l: List[Int])List[Int]

m(List(1,2,3))
// scala.NotImplementedError: an implementation is missing
//  at scala.Predef$.$qmark$qmark$qmark(Predef.scala:225)
//  ...


/** @return (mean, standard_deviation) */
def mean_stdDev(data: Seq[Double]): (Double, Double) = ???

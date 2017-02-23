// src/main/scala/progscala2/fp/combinators/combinators.sc

object Combinators1 {
  def map[A,B](list: List[A])(f: (A) => B): List[B] = list map f
}


object Combinators {
  def map[A,B](f: (A) => B)(list: List[A]): List[B] = list map f
}

val intToString = (i:Int) => s"N=$i"
val flist = Combinators.map(intToString) _
val list = flist(List(1,2,3,4))

// src/main/scala/progscala2/metaprogramming/mkArray.sc
import scala.reflect.ClassTag
// import scala.reflect.ClassTag

def mkArray[T : ClassTag](elems: T*) = Array[T](elems: _*)
// mkArray: [T](elems: T*)(implicit evidence$1: scala.reflect.ClassTag[T])Array[T]

mkArray(1, 2, 3)
// res0: Array[Int] = Array(1, 2, 3)

mkArray("one", "two", "three")
// res1: Array[String] = Array(one, two, three)

mkArray(1, "two", 3.14)
// res2: Array[Any] = Array(1, two, 3.14)

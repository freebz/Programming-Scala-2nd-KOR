// src/main/scala/progscala2/implicits/implicit-erasure.sc
object M {
  implicit object IntMarker
  implicit object StringMarker

  def m(seq: Seq[Int])(implicit i: IntMarker.type): Unit =
    println(s"Seq[Int]: $seq")

  def m(seq: Seq[String])(implicit s: StringMarker.type): Unit =
    println(s"Seq[String]: $seq")
}

import M._
m(List(1,2,3))
m(List("one", "two", "three"))

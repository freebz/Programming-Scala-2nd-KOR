// CHAPTER 8 스칼라 객체지향 프로그래밍

// 8.1 클래스와 객체의 기초

class Person(var name: String, var age: Int)

case class ImmutablePerson(name: String, age: Int)


object C {
  def m(seq: Seq[Int]): Unit = println(s"Seq[Int]: $seq")
  def m(seq: Seq[String]): Unit = println(s"Seq[String]: $seq")
}


trait Foo {
  val x: Int
  def x: Int
}


trait Foo {
  val x: Int
  def x(i: Int): Int
}

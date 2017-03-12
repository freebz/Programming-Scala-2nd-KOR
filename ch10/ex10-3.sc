// 10.4 Product, 케이스 클래스, 튜플

case class Person(name: String, age: Int)
// defined class Person

val p: Product = Person("Dean", 29)
// p: Product = Person(Dean,29) // 이 케이스 클래스 인스턴스를 Product 타입의 변수에 대입할 수 있다.

p.productArity                  // 필드의 개수
// res0: Int = 2

p.productElement(0)             // 원소 중 0번째에 있는 값(0이 첫 번째)
// res1: Any = Dean

p.productElement(1)
// res2: Any = 29

p.productIterator foreach println
// Dean
// 29



package scala
trait Product2[+T1, +T2] extends Product {
  abstract def _1: T1
  abstract def _2: T2
  ...
}


val t2 = ("Dean", 29)
// t2: (String, Int) = (Dean,29)

t2._1
// res0: String = Dean

t2._2
// res1: Int = 29

t2._3
// <console>:12: error: value _3 is not a member of (String, Int)
//        t2._3

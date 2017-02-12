// 4.12 패턴 매칭의 다른 사용법

case class Address(street: String, city: String, country: String)
case class Person(name: String, age: Int, address: Address)
val Person(name, age, Address(_, state, _)) =
  Person("Dean", 29, Address("1 Scala Way", "CA", "USA"))


val head +: tail = List(1,2,3)
val head1 +: head2 +: tail = Vector(1,2,3)
val Seq(a,b,c) = List(1,2,3)
val Seq(a,b,c) = List(1,2,3,4)


val p = Person("Dean", 29, Address("1 Scala Way", "CA", "USA"))
if (p == Person("Dean", 29,
  Address("1 Scala Way", "CA", "USA"))) "yes" else "no"
if (p == Person("Dean", 29,
  Address("1 Scala Way", "CA", "USSR"))) "yes" else "no"

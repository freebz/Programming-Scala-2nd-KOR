// 5.3 암시적 변환

(1, "one")
1 -> "one"
1 → "one"        // -> 대신 →를 사용함
Tuple2(1, "one")
Pair(1, "one")    // 스칼라 2.11부터는 사용 중단됨


Map("one" -> 1, "two" -> 2)


def apply[A, B](elems: (A, B)*): Map[A, B]


implicit final class ArrowAssoc[A](val self: A) {
  def -> [B](y: B): Tuple2[A, B] = Tuple2(self, y)
}


Map(new ArrowAssoc("one") -> 1, new ArrowAssoc("two") -> 2)


final class ArrowAssoc[A](val self: A) {
  def -> [B](y: B): Tuple2[A, B] = Tuple2(self, y)
}
  ...
implicit def any2ArrowAssoc[A](x: A): ArrowAssoc[A] = new ArrowAssoc(x)


val s = "Programming Scala"
s.reverse
s.capitalize
s.foreach(c => print(s"$c-"))


// 5.3.1 자신만의 문자열 인터폴레이션 만들기

val name = ("Buck", "Trends")
println(s"Hello, ${name._1} ${name._2}")


StringContext("Hello, ", " ", "").s(name._1, name._2)


val keys = List("a", "b", "c", "d")
val values = List("A", 123, 3.14159)
val keysValues = keys zip values


val jsonobj = json"{name: $name, book: $book}"
println(jsonobj)


// 5.3.2 표현력 문제

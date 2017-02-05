// 2.2 변수 정의

val array: Array[String] = new Array(5)
array = new Array(2)
array(0) = "Hello"
array

var stockPrice: Double = 100.0
stockPrice = 200.0


// 2.3 범위

1 to 10
1 until 10
1 to 10 by 3
10 to 1 by -3
1L to 10L by 3
1.1f to 10.3f by 3.1f
1.1f to 10.3f by 0.5f
1.1 to 10.3 by 3.1
'a' to 'g' by 3
BigInt(1) to BigInt(10) by 3
BigDecimal(1.1) to BigDecimal(10.3) by 3.1


// 2.5 메서드 선언
// 2.5.1 메서드의 기본 인자와 이름 붙은 인자

val p1 = new Point(x = 3.3, y = 4.4) // 이름 붙은 인자를 명시적으로 사용한다.
val p2 = p1.copy(y = 6.6) // 복사하되, y 값을 새로 지정한다.

// 2.5.2 인자 목록이 여럿 있는 메서드

s.draw(Point(1.0, 2.0))(str => println(s"ShapesDrawingActor: $str"))

s.draw(Point(1.0, 2.0)){str => println(s"ShapesDrawingActor: $str")}

s.draw(Point(1.0, 2.0)) { str =>
  println(s"ShapesDrawingActor: $str")
}

s.draw(Point(1.0, 2.0)) {
  str => println(s"ShapesDrawingActor: $str")
}

s.draw() {
  str => println(s"ShapesDrawingActor: $str")
}

s.draw(Point(1.0, 2.0),
  str => println(s"ShapesDrawingActor: $str")
)

s.draw(f = str => println(s"ShapesDrawingActor: $str"))


def m1[A](a: A, f: A => String) = f(a)
def m2[A](a: A)(f: A => String) = f(a)
m1(100, i => s"$i + $i")
m2(100)(i => s"$i + $i")


// 2.5.4 내포된 메서드 정의와 재귀

import scala.annotation.tailrec

@tailrec
def fibonacci(i: Int): Long = {
  if (i <= 1) 1L
  else fibonacci(i - 2) + fibonacci(i - 1)
}

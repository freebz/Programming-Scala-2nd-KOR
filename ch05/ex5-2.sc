// 5.2 암시적 인자를 사용하는 시나리오

// 5.2.1 실행 맥락 제공하기

apply[T](body: => T)(implicit executor: ExecutionContext): Future[T]

import scala.concurrent.ExecutionContext.Implicits.global


// 5.2.2 사용 가능한 기능 제어하기

def createMenu(implicit session: Session): Menu = {
  val defaultItems = List(helpItem, searchItem)
  val accountItems =
    if (session.loggedin()) List(viewAccountItem, editAccountItem)
    else List(loginItem)
  Menu(defaultItems ++ accountItems)
}


// 5.2.3 사용 가능한 인스턴스 제한하기

object manage {
  def apply[R <: { def close():Unit }, T](resource: => R)(f: R => T) = {...}
    ...
}


trait Closable {
  def close(): Unit
}
  ...
object manage {
  def apply[R <: Closable, T](resource: => R)(f: R => T) = {...}
    ...
}


trait TraversableLike[+A, +Repr] extends ... {
  ...
  def map[B, That](f: A => B)(
    implicit bf: CanBuildFrom[Repr, B, That]): That = {...}
    ...
}


// 5.2.4 암시적 증거 제공하기

trait TraversableOnce[+A] ... {
  ...
  def toMap[T, U](implicit ev: <:<[A, (T, U)]): immutable.Map[T, U]
    ...
}


// 동일
<:<[A, B]
A <:< B

<:<[A, (T, U)]
A <:< (T, U)]


val l1 = List(1, 2, 3)
l1.toMap
val l2 = List("one" -> 1, "tow" -> 2, "three" -> 3)
l2.toMap


// 5.2.5 타입 소거 우회하기

object M {
  def m(seq: Seq[Int]): Unit = println(s"Seq[Int]: $seq")
  def m(seq: Seq[String]): Unit = println(s"Seq[String]: $seq")
}


// 5.2.6 오류 메시지 개선하기

case class ListWrapper(list: List[Int])
List(1,2,3).map[Int, ListWrapper](_ * 2)


@implicitNotFound(msg =
  "Cannot construct a collection of type ${To} with elements of type ${Elem}" +
    " based on a collection of type ${From}.")

trait CanBuildFrom[-From, -Elem, +To] {...}


// 5.2.7 암시적 인자를 처리하기 위한 규칙

class Bad1 { // 우일한 인자 목록의 두 번째 인자에 implicit를 지정
  def m(i: Int, implicit s: String) = "boo"
}

class Bad2 { // 두 번째 인자 목록이 이미 implicit인데 세 번째 목록도 implicit로 지정
  def m(i: Int)(implicit s: String)(implicit d: Double) = "boo"
}

class Good1 { // 두 번째 인자 목록의 두 인자 s, d는 모두 암시적 인자임
  def m(i: Int)(implicit s: String, d: Double) = "boo"
}

class Good2 { // 유일한 인자 목록의 세 인자 i, s, d는 모두 암시적 인자임
  def m(implicit i: Int, s: String, d: Double) = "boo"
}

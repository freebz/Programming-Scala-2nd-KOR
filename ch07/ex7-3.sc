// 7.4 Option과 다른 컨테이너 타입

// 7.4.1 컨테이너로서의 Option

sealed abstract class Option[+A] { self =>
  ...
  def isEmpty: Boolean // Some이나 None이 구현한다.

  final def foreach[U](f: A => U): Unit =
    if (!isEmpty) f(this.get)

  final def map[B](f: A => B) =
    if (isEmpty) None else Some(f(this.get))

  final def flatMap[B](f: A => Option[B]): Option[B] =
    if (isEmpty) None else f(this.get)

  final def filter(p: A => Boolean): Option[A] =
    if (isEmpty || p(this.get)) this else None

  final def withFilter(p: A => Boolean): WithFilter = new WithFilter(p)

  /* 전체 WithFilter 클래스가 '새로운 컬렉션을 만들지 않는다'라는 계약을
   * 준수해야 한다. 물론 기껏해야 원소가 1개밖에 없는 컬렉션에서는
   * 그것이 큰 문제는 아닐 것이다.
   */
  class WithFilter(p: A => Boolean) {
    def map[B](f: A => B): Option[B] = self filter p map f
    def flatMap[B](f: A => Option[B]): Option[B] = self filter p flatMap f
    def foreach[U](f: A => U): Unit = self filter p foreach f
    def withFilter(q: A => Boolean): WithFilter =
      new WithFilter(x => p(x) && q(x))
  }
}



// 7.4.2 Either: Option의 논리적 확장

val l: Either[String, Int] = Left("boo")
val r: Either[String, Int] = Right(12)


val l1: Either[String, Int] = Left("boo")
val l2: String Either Int = Left("boohoo")    // 중위 표기법


type Or[A,B] = Either[A,B]
val l3: String Or Int = Left("better?")


l.left
l.right
r.left
r.right


l.left.map(_.size)
r.left.map(_.size)
l.right.map(_.toDouble)
r.right.map(_.toDouble)


l.left map (_.size)             // 반환: Left(3)
for (s <- l.left) yield s.size  // 반환: Left(3)



// 7.4.3 Try: 할 수 있는 일이 없을 때

sealed abstract class Try[+T] extends AnyRef {...}
final case class Success[+T](value: T) extends Try[T] {...}
final case class Failure[+T](exception: Throwable) extends Try[T] {...}

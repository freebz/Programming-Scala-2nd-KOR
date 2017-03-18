// CHAPTER 14 스칼라 타입 시스템 I

// 14.2 타입 바운드

// 14.2.1 상위 타입 바운드

implicit def refArrayOps[T <: AnyRef](xs: Array[T]): ArrayOps[T] =
  new ArrayOps.ofRef[T](xs)
implicit def longArrayOps(xs: Array[Long]): ArrayOps[Long] =
  new ArrayOps.ofLong(xs)
... // 다른 AnyVal 타입에 대한 메서드


// 14.2.2 하위 타입 바운드

sealed abstract class Option[+A] extends Product with Serializable {
  ...
    @inline final def getOrElse[B >: A](default: => B): B = {...}
  ...
}


val op3: Option[Parent] = Option[Child](null)
val p3a: Parent = op3.getOrElse(new Parent(20))



1 +: Seq(2, 3)
// res0: Seq[Int] = List(1, 2, 3)


def +:(elem: A) Seq[A] = {...}
def +:[B >: A, That](elem: B)(
  implicit bf: CanBuildFrom[Seq[A], B, That]): That = {...}


0.1 +: res0
// res1: Seq[AnyVal] = List(0.1, 1, 2, 3)


// 스칼라 2.11에서 경고를 없애기 위한 방법
val l2: List[AnyVal] = 0.1 +: res0


class Upper
class Middle1 extends Upper
class Middle2 extends Upper
class Lower extends Middle2
case class C[A >: Lower <: Upper](a: A)
// case class C2[A <: Upper >: Lower](a: A)  // 컴파일할 수 없음

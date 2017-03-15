// CHAPTER 12 스칼라 컬렉션 라이브러리

// 12.3 컬렉션 라이브러리의 설계 방식

// 12.3.1 Builder

trait Builder[-Elem, +To] {
  def +=(elem: Elem): Builder.this.type
  def clear()
  def result(): To
  ... // 위 세 추상 메서드로부터 파생된 다른 메서드들
}



// 12.3.2 CanBuildFrom

List(1, 2, 3, 4, 5) map (2 * _)
// res0: List[Int] = List(2, 4, 6, 8, 10)


map[B](f: (A) => B): List[B]


trait TraversableLike[+A, +Repr] extends ... {
  ...
  def map[B, That](f: A => B)(
    implicit bf: CanBuildFrom[Repr, B, That]): That = {...}
}


val set = collection.BitSet(1, 2, 3, 4, 5)
// set: scala.collection.BitSet = BitSet(1, 2, 3, 4, 5)

set map (_.toString)
// res0: scala.collection.SortedSet[String] = TreeSet(1, 2, 3, 4, 5)


"xyz" map (_.toInt)
// res0: scala.collection.immutable.IndexedSeq[Int] = Vector(120, 121, 122)



// 12.3.3 ...Like 트레이트

trait Seq[+A] extends Iterable[A] with collection.Seq[A]
    with GenericTraversableTemplate[A, Seq] with SeqLike[A, Seq[A]]
    with Parallelizable[A, ParSeq[A]]

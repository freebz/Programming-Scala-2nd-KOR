// 6.8 순회하기, 연관시키기, 걸러내기, 접기, 축약하기

// 6.8.1 순회

trait IterableLike[A] { // 일부 자세한 부분 생략함
  ...
  def foreach[U](f: A => U): Unit = { ... }
    ...
}


// 6.8.2 연관시키기

trait TraversableLike[A] { // 일부 자세한 부분 생략
  ...
  def map[B](f: (A) => B): Traversable[B]
    ...
}


def map[B, That](f: A => B)(implicit bf: CanBuildFrom[Repr, B, That]): That


trait List[A] {
  ...
  def map[B](f: (A) => B): List[B]
    ...
}


// 6.8.3 펼치면서 연관시키기

def flatMap[B](f: A => GenTraversableOnce[B]): Traversable[B]
def map[B](f: (A) => B): Traversable[B]


// 6.8.5 접기와 축약시키기

val list = List(1, 2, 3, 4, 5)
(list scan 10) (_ + _)

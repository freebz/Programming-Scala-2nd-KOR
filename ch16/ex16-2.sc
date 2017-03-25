// 16.2 카테고리 이론

// 16.2.2 펑터 카테고리

def map[A, B](seq: Seq[A])(f: A => B): Seq[B] = seq map f
def map[A, B](f: A => B)(seq: Seq[A]): Seq[B] = seq map f

val fm = map((i: Int) => i * 2.1) _
// fm: Seq[Int] => Seq[Double] = <function1>


// 16.2.3 모나드 카테고리

flatMap(unit(x))(f) == f(x)    x가 값인 경우
flatMap(m)(unit) == m          m이 Monad의 인스턴스인 경우

flatMap(flatMap(m)(f))(g) == flatMap(m)(x => flatMap(f(x))(g))

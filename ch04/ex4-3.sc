// 4.6 케이스 클래스에 일치시키기

// 4.6.1 unapply 메서드

def processSeq2[T](l: Seq[T]): Unit = l match {
  case +:(head, tail) =>
    printf("%s +: ", head)
    processSeq2(tail)
  case Nil => print("Nil")
}

processSeq2(List(1,2,3,4,5))


// 4.6.2 unapplySeq 메서드

val seq = Seq(1,2,3,4,5)
val slide2 = seq.sliding(2)
slide2.toSeq
slide2.toList
seq.sliding(3,2).toList

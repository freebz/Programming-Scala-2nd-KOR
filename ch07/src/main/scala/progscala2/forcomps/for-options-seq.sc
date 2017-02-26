// src/main/scala/progscala2/forcomps/for-options-seq.sc

val results: Seq[Option[Int]] = Vector(Some(10), None, Some(20))

val result2 = for {
  Some(i) <- results
} yield (2 * i)
// 반환: Seq[Int] = Vector(20, 40)


// 변환 단계 #1
val result2b = for {
  Some(i) <- results withFilter {
    case Some(i) => true
    case None => false
  }
} yield (2 * i)
// 반환: result2b: Seq[Int] = Vector(20, 40)


// 변환 단계 #2
val result2c = results withFilter {
  case Some(i) => true
  case None => false
} map {
  case Some(i) => (2 * i)
}
// 반환: result2c: Seq[Int] = Vector(20, 40)

/*
<console>:11: warning: match may not be exhaustive.
It would fail on the following input: None
       } map {
             ^
*/

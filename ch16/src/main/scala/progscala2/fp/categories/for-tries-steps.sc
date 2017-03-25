// src/main/scala/progscala2/fp/categories/for-tries-steps.sc

import scala.util.{ Try, Success, Failure }

type Step = Int => Try[Int]

val successfulSteps: Seq[Step] = List(
  (i:Int) => Success(i + 5),
  (i:Int) => Success(i + 10),
  (i:Int) => Success(i + 25))

val partiallySuccessfulSteps: Seq[Step] = List(
  (i:Int) => Success(i + 5),
  (i:Int) => Failure(new RuntimeException("FAIL!")),
  (i:Int) => Success(i + 25))

def sumCounts(countSteps: Seq[Step]): Try[Int] = {
  val zero: Try[Int] = Success(0)
  (countSteps foldLeft zero) {
    (sumTry, step) => sumTry flatMap (i => step(i))
  }
}

sumCounts(successfulSteps)
// 반환: scala.util.Try[Int] = Success(40)

sumCounts(partiallySuccessfulSteps)
// scala.util.Try[Int] = Failure(java.lang.RuntimeException: FAIL!)

// src/main/scala/progscala2/typesystem/valuetypes/infix-types.sc

val xll1: Int Either Double Either String = Left(Left(1))
// xll1: Either[Either[Int,Double],String] = Left(Left(1))

val xll2: (Int Either Double) Either String = Left(Left(1))
// xll2: Either[Either[Int,Double],String] = Left(Left(1))

val xlr1: Int Either Double Either String = Left(Right(3.14))
// xlr1: Either[Either[Int,Double],String] = Left(Right(3.14))

val xlr2: (Int Either Double) Either String = Left(Right(3.14))
// xlr2: Either[Either[Int,Double],String] = Left(Right(3.14))

val xr1: Int Either Double Either String = Right("foo")
// xr1: Either[Either[Int,Double],String] = Right(foo)

val xr2: (Int Either Double) Either String = Right("foo")
// xr2: Either[Either[Int,Double],String] = Right(foo)

val xl: Int Either (Double Either String) = Left(1)
// xl: Either[Int,Either[Double,String]] = Left(1)

val xrl: Int Either (Double Either String) = Right(Left(3.14))
// xrl: Either[Int,Either[Double,String]] = Right(Left(3.14))

val xrr: Int Either (Double Either String) = Right(Right("bar"))
// xrr: Either[Int,Either[Double,String]] = Right(Right(bar))

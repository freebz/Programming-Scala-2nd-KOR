// 15.4 값에 대한 타입

// 15.4.1 튜플 타입

val t1: Tuple3[String, Int, Double] = ("one", 2, 3.14)
val t2: (String, Int, Double)       = ("one", 2, 3.14)


// 15.4.2 함수 타입

val f1: Function2[Int,Double,String] = (i,d) => s"int $i, double $d"
val f2: (Int,Double) => String       = (i,d) => s"int $i, double $d"


// 15.4.3 중위 타입

val left1: Either[String,Int]  = Left("hello")
val left2: String Either Int   = Left("hello")
val right1: Either[String,Int] = Right(1)
val right2: String Either Int  = Right(2)

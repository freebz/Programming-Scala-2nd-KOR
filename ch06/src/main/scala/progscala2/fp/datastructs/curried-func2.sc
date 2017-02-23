// src/main/scala/progscala2/fp/datastructs/curried-func2.sc

val f1: String => String => String =
  (s1: String) => (s2: String) => s1+s2

val f2: String => (String => String) =
  (s1: String) => (s2: String) => s1 + s2

f1("hello")("world")
f2("hello")("world")



val cat3Uncurried = Function.uncurried(cat3Curried)
cat3Uncurried("hello", "world")

val ff1 = Function.uncurried(f1)
ff1("hello", "world")


def multiplier(i: Int)(factor: Int) = i * factor
val byFive = multiplier(5) _
val byTen = multiplier(10) _
byFive(2)
byTen(2)


def mult(d1: Double, d2: Double, d3: Double) = d1 * d2 * d3
val d3 = (2.2, 3.3, 4.4)
mult(d3._1, d3._2, d3._3)


val multTupled = Function.tupled(mult _)
multTupled(d3)
val multUntupled = Function.untupled(multTupled)
multUntupled(d3._1, d3._2, d3._3)

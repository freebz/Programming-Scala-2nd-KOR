// 4.1 단순 매치

val bools = Seq(true, false)

for (bool <- bools) {
  bool match {
    case true => println("Got heads")
    case false => println("Got tails")
  }
}


for (bool <- bools) {
  bool match {
    case true => println("Got heads")
//    case false => println("Got tails")
  }
}


for (bool <- bools) {
  val which = if (bool) "head" else "tails"
  println("Got " + which)
}

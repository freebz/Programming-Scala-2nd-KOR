// src/main/scala/progscala2/patternmatching/match-variable.sc

for {
  x <- Seq(1, 2, 2.7, "one", "two", 'four)
}{
  val str = x match {
    case 1          => "int 1"
    case i: Int     => "other int: "+i
    case d: Double  => "a double: "+x
    case "one"      => "string one"
    case s: String  => "other stirng: "+s
    case unexpected => "unexpected value: " + unexpected
  }
  println(str)
}

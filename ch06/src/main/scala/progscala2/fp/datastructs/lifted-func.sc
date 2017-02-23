// src/main/scala/progscala2/fp/datastructs/lifted-func.sc

val finicky: PartialFunction[String,String] = {
  case "finicky" => "FINICKY"
}

finicky("finicky")
finicky("other")

val finickyOption = finicky.lift
finickyOption("finicky")
finickyOption("other")

val finicky2 = Function.unlift(finickyOption)
finicky2("finicky")
finicky2("other")

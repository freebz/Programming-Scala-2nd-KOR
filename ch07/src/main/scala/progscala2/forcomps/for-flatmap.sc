// src/main/scala/progscala2/forcomps/for-flatmap.sc

val states = List("Alabama", "Alaska", "Virginia", "Wyoming")

for {
  s <- states
  c <- s
} yield s"$c-${c.toUpper}"

states flatMap (_.toSeq map (c => s"$c-${c.toUpper}"))

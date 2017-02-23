// src/main/scala/progscala2/fp/datastructs/map.sc

val stateCapitals = Map(
  "Alabama" -> "Montgomery",
  "Alaska"  -> "Juneau",
  "Wyoming" -> "Cheyenne")

val lengths = stateCapitals map {
  kv => (kv._1, kv._2.lengths)
}

val caps = stateCapitals map {
  case (k, v) => (k, v.toUpperCase)
}

val stateCapitals2 = stateCapitals + (
  "Virginia" -> "Richmond")

val stateCapitals3 = stateCapitals2 + (
  "New York" -> "Albany", "Illinois" -> "Springfield")

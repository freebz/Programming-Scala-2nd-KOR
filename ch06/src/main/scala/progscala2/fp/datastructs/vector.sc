// src/main/scala/progscala2/fp/datastructs/vector.sc

val vect1 = Vector("Programming", "Scala")
val vect2 = "People" +: "should" +: "read" +: vect1
val vect3 = "Programming" +: "Scala" +: Vector.empty
val vect4 = "People" +: "should" +: "read" +: Vector.empty
val vect5 = vect4 ++ vect3


vect5(3)

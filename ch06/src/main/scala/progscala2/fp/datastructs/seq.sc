// src/main/scala/progscala2/fp/datastructs/seq.sc

val seq1 = Seq("Programming", "Scala")
val seq2 = "People" +: "should" +: "read" +: seq1
val seq3 = "Programming" +: "Scala" +: Seq.empty
val seq4 = "People" +: "should" +: "read" +: Seq.empty
val seq5 = seq4 ++ seq3


val seq1 = Seq("Programming", "Scala")
val seq2 = seq1 :+ "Rocks!"

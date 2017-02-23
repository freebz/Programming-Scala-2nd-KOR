// src/main/scala/progscala2/fp/datastructs/fold-assoc-funcs.sc

val facLeft = (accum: Int, x: Int) => accum + x
val facRight = (x: Int, accum: Int) => accum + x
val list1 = List(1,2,3,4,5)
list1 reduceLeft facLeft
list1 reduceRight facRight


val fncLeft = (accum: Int, x: Int) => accum - x
val fncRight = (x: Int, accum: Int) => accum - x
list1 reduceLeft fncLeft
list1 reduceRight fncRight


val fnacLeft = (x: String, y: String) => s"($x)-($y)"
val fnacRight = (x: String, y: String) => s"($y)-($x)"
val list2 = list1 map (_.toString) // Stirng의 리스트를 만듦
list2 reduceLeft fnacLeft
list2 reduceRight fnacRight
list2 reduceRight fnacLeft

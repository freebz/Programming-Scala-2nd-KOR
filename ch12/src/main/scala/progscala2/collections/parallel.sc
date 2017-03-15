// src/main/scala/progscala2/collections/parallel.sc

((1 to 10) fold "") ((s1, s2) => s"$s1 - $s2")
// res0: Any = " - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10"

((1 to 10) fold "") ((s1, s2) => s"$s1 - $s2")
// res1: Any = " - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10"

((1 to 10).par fold "") ((s1, s2) => s"$s1 - $s2")
// res2: Any = " - 1 - - 2 - - 3 - 4 - 5 - - 6 - - 7 - - 8 - - 9 - - 10"

((1 to 10).par fold "") ((s1, s2) => s"$s1 - $s2")
// res3: Any = " - 1 - - 2 - - 3 - - 4 - 5 - - 6 - - 7 - - 8 - 9 - 10"



((1 to 10) fold 0) ((s1, s2) => s1 + s2)
// res4: Int = 55

((1 to 10) fold 0) ((s1, s2) => s1 + s2)
// res5: Int = 55

((1 to 10).par fold 0) ((s1, s2) => s1 + s2)
// res6: Int = 55

((1 to 10).par fold 0) ((s1, s2) => s1 + s2)
// res7: Int = 55

// 2.8 리터럴 값

// 2.8.1 정수 리터럴

val i = 1234567890123
val i = 1234567890123L
val b: Byte = 128
val b: Byte = 127


// 2.8.2 부동소수점 리터럴

.14
3.14
3.14f
3.14F
3.14d
3.14D
3e5
3E5
3.14e+5
3.14e-5
3.14e-5
3.14e-5f
3.14e-5F
3.14e-5d
3.14e-5D


// 2.8.3 불린 리터럴

val b1 = true
val b2 = false


// 2.8.4 문자 리터럴

'A'
'\u0041'
'\n'
'\012'
'\t'


// 2.8.5 문자열 리터럴

"Programming\nScala"
"He exclaimed, \"Scala is great!\""
"First\tSecond"

"""Programming\nScala"""
"""He exclaimed, "Scala is greate" """
"""First line\n
Second line\t

Fourth line"""


// 2.8.6 심벌 리터럴

'id
scala.Symbol("id")
Symbol(" Programming Scala ")


// 2.8.7 함수 리터럴

val f1: (Int,String) => String       = (i, s) => s+i
val f2: Function2[Int,String,String] = (i, s) => s+i


// 2.8.8 튜플 리터럴

val t1: (Int,String) = (1, "two")
val t2: Tuple2[Int,String] = (1, "two")

(1, "one")
1 -> "one"
1 → "one"          // -> 대신 → 문자를 사용함
Tuple2(1, "one")

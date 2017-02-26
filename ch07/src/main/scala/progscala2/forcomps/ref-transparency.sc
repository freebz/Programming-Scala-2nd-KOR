// src/main/scala/progscala2/forcomps/ref-transparency.sc

def addInts(s1: String, s2: String): Int =
  s1.toInt + s2.toInt

for {
  i <- 1 to 3
  j <- 1 to i
} println(s"$i+$j = ${addInts(i.toString,j.toString)}")
/*
1+1 = 2
2+1 = 3
2+2 = 4
3+1 = 4
3+2 = 5
3+3 = 6
*/

addInts("0", "x")
// java.lang.NumberFormatException: For input string: "x"
// ...


def addInts2(s1: String, s2: String): Either[NumberFormatException,Int] =
  try {
    Right(s1.toInt + s2.toInt)
  } catch {
    case nfe: NumberFormatException => Left(nfe)
  }
// addInts2: (s1: String, s2: String)Either[NumberFormatException,Int]

println(addInts2("1", "2"))
// Right(3)

println(addInts2("1", "x"))
// Left(java.lang.NumberFormatException: For input string: "x")

println(addInts2("x", "2"))
// Left(java.lang.NumberFormatException: For input string: "x")

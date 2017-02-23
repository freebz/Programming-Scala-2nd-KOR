// src/main/scala/progscala2/fp/datastructs/curried-func.sc

def cat1(s1: String)(s2: String) = s1 + s2


def cat2(s1: String) = (s2: String) => s1 + s2


val cat2hello = cat2("Hello ") // _가 없음

cat2hello("World!")


cat1("foo")("bar")
cat2("foo")("bar")


def cat3(s1: String, s2: String) = s1 + s2
cat3("hello", "world")

val cat3Curried = (cat3 _).curried
cat3Curried("hello")("world")

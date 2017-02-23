// src/main/scala/progscala2/fp/curry/curried-func.sc

def cat1(s1: String)(s2: String) = s1 + s2


val hello = cat1("Hello ") _
hello("World!")

cat1("Hello ")("World!")


val inverse: PartialFunction[Double,Double] = {
  case d if d != 0.0 => 1.0 / d
}

inverse(1.0)
inverse(2.0)
inverse(0.0)

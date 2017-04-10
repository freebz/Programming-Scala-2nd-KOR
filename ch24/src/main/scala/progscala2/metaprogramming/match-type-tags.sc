// src/main/scala/progscala2/metaprogramming/match-type-tags.sc

import scala.reflect.runtime.universe._

def toType2[T](t: T)(implicit tag: TypeTag[T]): Type = tag.tpe
def toType[T : TypeTag](t: T): Type = typeOf[T]


toType(1)
// res1: reflect.runtime.universe.Type = Int

toType(true)
// res2: reflect.runtime.universe.Type = Boolean

toType(Seq(1, true, 3.14))
// res3: reflect.runtime.universe.Type = Seq[AnyVal]

toType((i: Int) => i.toString)
// res4: reflect.runtime.universe.Type = Int => String


toType(1) =:= typeOf[AnyVal]             // false
toType(1) =:= toType(1)                  // true
toType(1) =:= toType(true)               // false

toType(1) <:< typeOf[AnyVal]             // true
toType(1) <:< toType(1)                  // true
toType(1) <:< toType(true)               // false

typeOf[Seq[Int]] =:= typeOf[Seq[Any]]    // false
typeOf[Seq[Int]] <:< typeOf[Seq[Any]]    // true


typeTag[Int]         // reflect.runtime.universe.TypeTag[Int] = TypeTag[Int]
typeTag[Seq[Int]]    // ...TypeTag[Seq[Int]] = TypeTag[scala.Seq[Int]]

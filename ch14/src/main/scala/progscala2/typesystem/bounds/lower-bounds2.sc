// src/main/scala/progscala2/typesystem/bounds/lower-bounds2.sc

case class Opt[+A](value: A = null) {
  def getOrElse(default: A) = if (value != null) value else default
}
// <console>:8: error: covariant type A occurs in contravariant position in type A of value default
//          def getOrElse(default: A) = if (value != null) value else default
//                        ^


case class Opt[A](value: A = null) {
  def getOrElse(default: A) = if (value != null) value else default
}

val p4: Parent = Opt(new Child(1)).getOrElse(new Parent(10))
// <console>:11: error: type mismatch;
//  found   : Parent
//  required: Child
//        val p4: Parent = Opt(new Child(1)).getOrElse(new Parent(10))
//                                                     ^

val p5: Parent = Opt[Parent](null).getOrElse(new Parent(10))
// p5: Parent = Parent(10)

val p6: Parent = Opt[Child](null).getOrElse(new Parent(10))
// <console>:11: error: type mismatch;
//  found   : Parent
//  required: Child
//        val p6: Parent = Opt[Child](null).getOrElse(new Parent(10))
//                                                    ^

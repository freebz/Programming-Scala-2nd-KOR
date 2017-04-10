// 24.4 매크로

val C = q"case class C(s: String)"
// C: reflect.runtime.universe.ClassDef =
// case class C extends scala.Product with scala.Serializable {
//   <caseaccessor> <paramaccessor> val s: String = _;
//   def <init>(s: String) = {
//     super.<init>();
//     ()
//   }
// }


showCode(C)
// res0: String = case class C(s: String)

showRaw(C)
// res1: String = ClassDef(Modifiers(CASE), TypeName("C"), List(), ...)



val q = q"List[String]"
// q: reflect.runtime.universe.Tree = List[String]

val tq = tq"List[String]"
// tq: reflect.runtime.universe.Tree = List[String]

showRaw(q)
// res2: String = TypeApply(Ident(TermName("List")),
//   List(Ident(TypeName("String"))))

showRaw(tq)
// res3: String = AppliedTypeTree(Ident(TypeName("List")),
//   List(Ident(TypeName("String"))))

q equalsStructure tq
// res4: Boolean = false



Seq(tq"Int", tq"String") map { param =>
  q"case class C(s: $param)"
} foreach { q =>
  println(showCode(q))
}
// case class C(s: Int)
// case class C(s: String)


val list = Seq(1,2,3,4)
val fmt = "%d, %d, %d, %d"
val printq = q"println($fmt, ..$list)"


val q"${i: Int} + ${d: Double}" = q"1 + 3.14"
// i: Int = 1
// d: Double = 3.14

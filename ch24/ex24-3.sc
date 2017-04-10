// 24.3 스칼라의 고급 실행 시점 리플렉션 API

def toTypeRefInfo[T : TypeTag](x: T): (Type, Symbol, Seq[Type]) = {
  val TypeRef(pre, typName, parems) = toType(x)
  (pre, typName, parems)
}


toTypeRefInfo(1)                       // (scala.type,class Int,List())
toTypeRefInfo(true)                    // (scala.type,class Boolean,List())
toTypeRefInfo(Seq(1, true, 3.14))      // (scala.collection.type,trait Seq,
                                       //    List(AnyVal))
toTypeRefInfo((i: Int) => i.toString)  // (scala.type,trait Function1,
                                       //    List(Int, String))


val ts = toType(Seq(1, true, 3.14))
// ts: reflect.runtime.universe.Type = Seq[AnyVal]

ts.typeSymbol
// res0: reflect.runtime.universe.Symbol = trait Seq

ts.erasure
// res1: reflect.runtime.universe.Type = Seq[Any]


ts.typeArgs
// res2: List[reflect.runtime.universe.Type] = List(AnyVal)

ts.baseClasses
// res4: List[reflect.runtime.universe.Symbol] =
//   List(trait Seq, trait SeqLike, trait GenSeq, trait GenSeqLike, ...)

ts.companion
// res5: reflect.runtime.universe.Type = scala.collection.Seq.type

ts.decls
// res6: reflect.runtime.universe.MemberScope = SynchronizedOps(
//   method $init$, method companion, method seq)

ts.members
// res7: reflect.runtime.universe.MemberScope = Scopes(
//   method seq, method companion, method $init$, method toString, ...)

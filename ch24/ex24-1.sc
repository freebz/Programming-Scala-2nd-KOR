// CHAPTER 24 메타프로그래밍: 매크로와 리플렉션

// 24.1 타입을 이해하기 위한 도구

if (true) false else 11.1
// res0: AnyVal = false

:type if (true) false else 11.1
// AnyVal

:type -v if (true) false else 11.1
// // Type signature
// AnyVal

// // Internal Type structure
// TypeRef(TypeSymbol(abstract class AnyVal extends Any))

// 24.2 실행 시점 리플렉션

// 24.2.1 타입에 대한 리플렉션

c.isInstanceOf[String]
// <console>:12: warning: fruitless type test: a value of type C cannot
//   also be a String (the underlying of String)
//               c.isInstanceOf[String]
                            ^
// res0: Boolean = false

c.isInstanceOf[C]
// res1: Boolean = true

c.asInstanceOf[T[AnyRef]]
// res2: T[AnyRef] = C@42d3bd8b

// 12.4 값 타입을 위한 특화

class SpecialVector[@specialized(Int, Double, Boolean) T] {...}


// 12.4.1 미니박싱

class SpecialVector[@miniboxed(Int, Double, Boolean) T] {...}


trait C[T]                         // 원래는 class C[T]
class C_primitive[T] extends C[T]  // T는 AnyVal
class C_anyref[T] extends C[T]     // T는 AnyRef

trait D[T] extends C[T]                                // 원래는 class D[T]
class D_primitive[T] extends C_primitive[T] with D[T]  // T는 AnyVal
class D_anyref[T] extends C_anyref[T] with D[T]        // T는 AnyRef

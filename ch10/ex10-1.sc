// CHAPTER 10 스칼라 객체 시스템 I

// 10.1 매개변수화한 타입: 상속에 따른 변성

class W[+A] {...}       // 공변성
class X[-A] {...}       // 반공변성
class Y[A] {...}        // 무공변성
class Z[-A,B,+C] {...}  // 혼합


// 10.1.1 함수 내부 들여다보기

List(1, 2, 3, 4) map (i => i + 3)
// 결과: List(4, 5, 6, 7)


val f: Int => Int = new Function1[Int,Int] {
  def apply(i: Int): Int = i + 3
}
List(1, 2, 3, 4) map (f)
// 결과: List(4, 5, 6, 7)


trait Function2[-T1, -T2, +R] extends AnyRef


trait MyFunction2[+T1, +T2, -R] {
  def apply(v1:T1, v2: T2): R = ???
}

<console>:8: error: contravariant type R occurs in covariant position in type (v1: T1, v2: T2)R of method apply
         def apply(v1:T1, v2: T2): R = ???
             ^
<console>:8: error: covariant type T1 occurs in contravariant position in type T1 of value v1
         def apply(v1:T1, v2: T2): R = ???
                   ^
<console>:8: error: covariant type T2 occurs in contravariant position in type T2 of value v2
         def apply(v1:T1, v2: T2): R = ???


// 10.1.2 변경 가능한 타입의 변성

class ContainerPlus[+A](var a: A) {
  private var _value: A = a
  def value_=(newA: A): Unit = _value = newA
  def value: A = _value
}


val cp = new ContainerPlus(new C)
cp.value = new C
cp.value = new CSub
cp.value = new CSuper    // 컴파일 오류!


val cp: ContainerPlus[C] = new ContainerPlus(new CSub)
cp.value = new C         // value_= 메서드는 값 필드가 CSub타입이라 C를 받을 수 없다.
cp.value = new CSub
cp.value = new CSuper    // 컴파일 오류! C 인스턴스를 CSuper로 대치할 수 없음


class ContainerMinus[-A](var a: A) {
  private var _value: A = a
  def value_=(newA: A): Unit = _value = newA
  def value: A = _value
}

val cm: ContainerMinus[C] = new ContainerMinus(new CSuper)
val c: C  = cm.value    // C를 반환해야하는데, CSuper를 반환한다.
val c: CSuper = cm.value
val c: CSub = cm.value  // CSub를 반환해야하는데, CSuper를 반환한다.

// 변경가능한 필드 A에 대해서는 무공변성만 가능하다.

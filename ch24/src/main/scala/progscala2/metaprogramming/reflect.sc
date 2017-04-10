// src/main/scala/progscala2/metaprogramming/reflect.sc

import scala.language.existentials
// import scala.language.existentials

trait T[A] {
  val vT: A
  def mT = vT
}
// defined trait T

class C(foo: Int) extends T[String] {
  val vT = "T"
  val vC = "C"
  def mC = vC

  class C2
}
// defined class C

val c = new C(3)
// c: C = C@42d3bd8b

val clazz = classOf[C]          // 스칼라 메서드: classOf[C]
// clazz: Class[C] = class C

val clazz2 = c.getClass         // java.lang.Object의 메서드
// clazz2: Class[_ <: C] = class C

val name = clazz.getName
// name: String = C

val methods = clazz.getMethods
// methods: Array[java.lang.reflect.Method] =
//   Array(public java.lang.Object C.vT(), public java.lang.String C.vT(), ...)

val ctors = clazz.getConstructors
// ctors: Array[java.lang.reflect.Constructor[_]] = Array(public C(int))

val fields = clazz.getFields
// fields: Array[java.lang.reflect.Field] = Array()

val annos = clazz.getAnnotations
// annos: Array[java.lang.annotation.Annotation] = Array()

val parentInterfaces = clazz.getInterfaces
// parentInterfaces: Array[Class[_]] = Array(interface T)

val superClass = clazz.getSuperclass
// superClass: Class[_ >: C] = class java.lang.Object

val typeParams = clazz.getTypeParameters
// typeParams: Array[java.lang.reflect.TypeVariable[Class[C]]] = Array()

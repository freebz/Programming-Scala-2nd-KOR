// src/main/scala/progscala2/javainterop/ComplexBean.scala
package progscala2.javainterop

// 스칼라 2.11의 경우. 스칼라 2.10이나 그 이전이라면 scala.reflect.BeanProperty를 사용한다.
case class ComplexBean(
  @scala.beans.BeanProperty real: Double,
  @scala.beans.BeanProperty imaginary: Double) {

  def +(that: ComplexBean) =
    new ComplexBean(real + that.real, imaginary + that.imaginary)

  def -(that: ComplexBean) =
    new ComplexBean(real - that.real, imaginary - that.imaginary)
}

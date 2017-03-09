// src/main/scala/progscala2/traits/ui2/Clickable.scala
package progscala2.traits.ui2

trait Clickable {
  def click(): Unit = updateUI()

  protected def updateUI(): Unit
}

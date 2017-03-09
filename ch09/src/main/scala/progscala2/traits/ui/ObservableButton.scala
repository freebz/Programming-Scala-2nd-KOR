// src/main/scala/progscala2/traits/ui/ObservableButton.scala
package progscala2.traits.ui
import progscala2.traits.observer._

class ObservableButton(name: String)
    extends Button(name) with Subject[Button] {

  override def click(): Unit = {
    super.click()
    notifyObservers(this)
  }
}

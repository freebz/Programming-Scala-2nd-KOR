// src/main/scala/progscala2/typesystem/structuraltypes/Observer.scala
package progscala2.typesystem.structuraltypes

trait Subject {

  import scala.language.reflectiveCalls

  type State

  type Observer = { def receiveUpdate(state: Any): Unit }

  private var observers: List[Observer] = Nil

  def addObserver(observer:Observer): Unit =
    observers ::= observer

  def notifyObservers(state: State): Unit =
    observers foreach (_.receiveUpdate(state))
}

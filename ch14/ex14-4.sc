// 14.7 구조적 타입

trait Observer[-State] {
  def receiveUpdate(state: State): Unit
}
trait Subject[State] {
  private var observers: List[Observer[State]] = Nil
  ...
}

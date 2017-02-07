// src/main/scala/progscala2/rounding/lazy-init-val.sc

object ExpensiveResource {
  lazy val resource: Int = init()
  def init(): Int = {
    // 시간이 오래 걸리는 작업을 수행함
    0
  }
}

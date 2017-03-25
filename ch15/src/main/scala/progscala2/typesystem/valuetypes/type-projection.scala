// src/main/scala/progscala2/typesystem/valuetypes/type-projection.scala
package progscala2.typesystem.valuetypes

trait Logger {
  def log(message: String): Unit
}

class ConsoleLogger extends Logger {
  def log(message: String): Unit = println(s"log: $message")
}

trait Service {
  type Log <: Logger
  val logger: Log
}

class Service1 extends Service {
  type Log = ConsoleLogger
  val logger: ConsoleLogger = new ConsoleLogger
}

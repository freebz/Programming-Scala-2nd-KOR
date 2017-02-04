// src/main/scala/progscala2/introscala/shapes/ShapesDrawingActor.scala
package progscala2.introscala.shapes

object Messages {
  object Exit
  object Finished
  case class Response(message: String)
}

import akka.actor.Actor

class ShapesDrawingActor extends Actor {
  import Messages._

  def receive = {
    case s: Shape =>
      s.draw(str => println(s"ShapesDrawingActor: $str"))
      sender ! Response(s"ShapesDrawingActor: $s drawn")
    case Exit =>
      println(s"ShapesDrawingActor: exiting...")
      sender ! Finished
    case unexpected => // 그 밖의 경우에는 "unexpected: Any"와 같음
      val response = Response(s"ERROR: Unknown message: $unexpected")
      println(s"ShapesDrawingActor: $response")
      sender ! response
  }
}

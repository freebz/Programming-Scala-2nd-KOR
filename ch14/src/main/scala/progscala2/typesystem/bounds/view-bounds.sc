// src/main/scala/progscala2/typesystem/bounds/view-bounds.sc
import scala.language.implicitConversions

object Serialization {
  case class Writable(value: Any) {
    def serialized: String = s"-- $value --"
  }

  implicit def fromInt(i: Int) = Writable(i)
  implicit def fromFloat(f: Float) = Writable(f)
  implicit def fromString(s: String) = Writable(s)
}

import Serialization._

object RemoteConnection {
  def write[T <% Writable](t: T): Unit =
    println(t.serialized) // stdout을 '원격 연결'로 사용한다.
}

RemoteConnection.write(100)       // 출력: -- 100 --
RemoteConnection.write(3.14f)     // 출력: -- 3.14 --
RemoteConnection.write("hello!")  // 출력: -- hello! --
// RemoteConnection.write((1, 2))

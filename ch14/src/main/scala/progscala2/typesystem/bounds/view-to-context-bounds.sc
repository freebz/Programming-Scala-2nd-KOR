// src/main/scala/progscala2/typesystem/bounds/view-to-context-bounds.sc
import scala.language.implicitConversions

object Serialization {
  case class Rem[A](value: A) {
    def serialized: String = s"-- $value --"
  }
  type Writable[A] = A => Rem[A]
  implicit val fromInt: Writable[Int]       = (i: Int)    => Rem(i)
  implicit val fromFloat: Writable[Float]   = (f: Float)  => Rem(f)
  implicit val fromString: Writable[String] = (s: String) => Rem(s)
}

import Serialization._

object RemoteConnection {
  def write[T : Writable](t: T): Unit =
    println(t.serialized) // 표준 출력을 '원격 연결' 대신 사용
}

RemoteConnection.write(100)       // 출력: -- 100 --
RemoteConnection.write(3.14f)     // 출력: -- 3.14 --
RemoteConnection.write("hello!")  // 출력: -- hello! --
// Remoteconnection.write((1, 2))

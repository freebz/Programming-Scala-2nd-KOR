// src/main/scala/progscala2/typelessdomore/abstract-types.sc

import java.io._

abstract class BulkReader {
  type In
  val source: In
  def read: String // 원본을 읽어서 String을 반환한다.
}

class StringBulkReader(val source: String) extends BulkReader {
  type In = String
  def read: String = source
}

class FileBulkReader(val source: File) extends BulkReader {
  type In = File
  def read: String = {...}
}

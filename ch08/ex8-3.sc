// 8.4 부모 타입

abstract class BulkReader {
  type In
  val source: In
  def read: String // source를 읽어서 String을 반환한다.
}

class StringBulkReader(val source: String) extends BulkReader {
  type In = String
  def read: String = source
}

class FileBulkReader(val source: java.io.File) extends BulkReader {
  type In = java.io.File
  def read: String = {...}
}

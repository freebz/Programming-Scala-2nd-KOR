// CHAPTER 11 스칼라 객체 시스템 II

// 11.1.5 추상 타입 오버라이딩하기

abstract class BulkReader {
  type In
  val source: In
  def read: String // 원본을 읽어서 String을 반환한다.
}

class StringBulkReader(val source: String) extends BulkReader {
  type In = String
  def read: String = source
}
...

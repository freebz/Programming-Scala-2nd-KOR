// src/main/scala/progscala2/rounding/TryCatch.scala
package progscala2.rounding

object TryCatch {
  /** 사용법: scala rounding.Trycatch filename1 filename2 ... */
  def main(args: Array[String]) = {
    args foreach (arg => countLines(arg))
  }

  import scala.io.Source
  import scala.util.control.NonFatal

  def countLines(fileName: String) = {
    println() // 읽기 쉽게 하기 위해 빈 줄을 넣는다.
    var source: Option[Source] = None
    try {
      source = Some(Source.fromFile(fileName))
      val size = source.get.getLines.size
      println(s"file $fileName has $size lines")
    } catch {
      case NonFatal(ex) => println(s"Non fatal exception! $ex")
    } finally {
      for (s <- source) {
        println(s"Closing $fileName...")
        s.close
      }
    }
  }
}

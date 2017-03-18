// 14.9 존재 타입

object Doubler {
  def double(seq: Seq[String]): Seq[Int] = double(seq map (_.toInt))
  def double(seq: Seq[Int]): Seq[Int] = seq map (_*2)
}

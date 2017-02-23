// src/main/scala/progscala2/fp/datastructs/package.scala
package progscala2.fp
package object datastructs {
  type Seq[+A] = scala.collection.immutable.Seq[A]
  val Seq = scala.collection.immutable.Seq
}


package fp.datastructs  // Seq가 immutable.Seq를 가리키게 만든다.
package asubpackage     // 이 패키지를 채워 넣는다.
package asubsubpackage  // 작업할 대상 패키지다.

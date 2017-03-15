// src/main/scala/progscala2/collections/safeseq/safeseq.sc

val mutableSeq1: Seq[Int] = List(1,2,3,4)
// mutableSeq1: Seq[Int] = List(1, 2, 3, 4)

val mutableSeq2: Seq[Int] = Array(1,2,3,4)
// mutableSeq2: Seq[Int] = WrappedArray(1, 2, 3, 4)

import progscala2.collections.safeseq._
// import progscala2.collections.safeseq._

val immutableSeq1: Seq[Int] = List(1,2,3,4)
// immutableSeq1: progscala2.collections.safeseq.Seq[Int] = List(1, 2, 3, 4)

val immutableSeq2: Seq[Int] = Array(1,2,3,4)
// <console>:10: error: type mismatch;
//  found   : Array[Int]
//  required: progscala2.collections.safeseq.Seq[Int]
//     (which expands to)  scala.collection.immutable.Seq[Int]
//        val immutableSeq2: Seq[Int] = Array(1,2,3,4)
//                                           ^

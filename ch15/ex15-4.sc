// 15.5 고계 타입

def sum(seq: Seq[Int]): Int = seq reduce (_ + _)

sum(Vector(1,2,3,4,5)) // Result: 15 // 결과: 15

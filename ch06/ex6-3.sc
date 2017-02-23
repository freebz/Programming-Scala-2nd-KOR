// 6.9 왼쪽 순회와 오른쪽 순회

// fold
(List(1,2,3,4,5) fold 10) (_ * _)
(List(1,2,3,4,5) foldLeft 10) (_ * _)
(List(1,2,3,4,5) foldRight 10) (_ * _)

// reduce
List(1,2,3,4,5) reduce (_ + _)
List(1,2,3,4,5) reduceLeft (_ + _)
List(1,2,3,4,5) reduceRight (_ + _)

// src/main/scala/progscala2/fp/datastructs/foldreduce.sc

val list = List(1,2,3,4,5,6)
list reduce (_ + _)
list.fold (10) (_ * _)
(list fold 10) (_ * _)


val fold1 = (list fold 10) _
fold1(_ * _)


(List.empty[Int] fold 10) (_ + _)
List.empty[Int] reduce (_ + _)


List.empty[Int] reduceOption (_ + _)
List(1,2,3,4,5) reduceOption (_ + _)

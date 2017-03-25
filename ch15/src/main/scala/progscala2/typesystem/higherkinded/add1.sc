// src/main/scala/progscala2/typesystem/higherkinded/add1.sc

import scala.language.higherKinds
import progscala2.typesystem.higherkinded.{Add, Reduce1}
import progscala2.typesystem.higherkinded.Add._
import progscala2.typesystem.higherkinded.Reduce1._

def sum[T : Add, M[_] : Reduce1](container: M[T]): T =
  implicitly[Reduce1[M]].reduce(container)(implicitly[Add[T]].add(_,_))

sum(Vector(1 -> 10, 2 -> 20, 3 -> 30))        // 결과: (6, 60)
sum(1 to 10)                                  // 결과: 55
sum(Option(2))                                // 결과: 2
sum[Int,Option](None)                         // 오류!

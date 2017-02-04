// 1.4 동시성 맛보기

import progscala2.introscala.shapes._

val p00 = new Point
val p20 = new Point(2.0)
val p20b = new Point(2.0)
val p02 = new Point(y = 2.0)
p00 == p20b
p20 == p20b

val p1 = Point.apply(1.0, 2.0)
val p2 = Point(1.0, 2.0)

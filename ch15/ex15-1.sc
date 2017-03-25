// CHAPTER 15 스칼라 타입 시스템 II

// 15.1 경로에 의존하는 타입

// 15.1.1 C.this

trait T1 {
  class C
  val c1: C = new C
  val c2: C = new this.C
}


// 15.1.2 C.super

trait X {
  def setXX(x:String): Unit = {}                // 아무 일도 하지 않음!
}
class C2 extends C1
class C3 extends C2 with X {
  def setX3(x:String): Unit = super.setX1(x)
  def setX4(x:String): Unit = C3.super.setX1(x)
  def setX5(x:String): Unit = C3.super[C2].setX1(x)
  def setX6(x:String): Unit = C3.super[X].setXX(x)
  // def setX7(x:String): Unit = C3.super[C1].setX1(x)   // 오류
  // def setX8(x:String): Unit = C3.super.super.setX1(x) // 오류
}


class C4 {
  class C5
}
class C6 extends C4 {
  val c5a: C5 = new C5
  val c5b: C5 = new super.C5
}


// 15.1.3 경로.x

package P1 {
  object O1 {
    object O2 {
      val name = "name"
    }
    class C1 {
      val name = "name"
    }
  }
}

class C7 {
  val name1 = P1.O1.O2.name      // OK - 필드에 대한 참조
  type C1   = P1.O1.C1           // OK - '말단' 클래스에 대한 참조
  val c1    = new P1.O1.C1       // OK - 위와 같은 이유
  // val name2 = P1.O1.C1.name   // 오류 - P1.O1.C1은 안정적이지 않음
}

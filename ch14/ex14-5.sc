// 14.8 복합 타입

trait T1
trait T2
class C
val c = new C with T1 with T2 // c의 타입: C with T1 with T2


val t1: T1 = c
val t2: T2 = c
val c2: C = c


// 14.8.1 타입 세분화

List<C> listOfC = ...
java.util.Collections.sort(listOfC, new Comparator<C>() {
  public int compare(C c1, C c2) {...}
  public boolean equals(Object obj) {...}
});


val subject = new Subject {
  type State = Int
  protected var count = 0
  def increment(): Unit = {
    count += 1
    notifyObservers(count)
  }
}
// subject: TypeSystem.structuraltypes.Subject{
//   type State = Int; def increment(): Unit} = $anon$1@75bd7c22


trait Logging {
  def log(message: String): Unit = println(s"Log: $message")
}
val subject = new Subject with Logging {
  type State = Int
  protected var count = 0
  def increment(): Unit = {
    count += 1
    notifyObservers(count)
  }
}
// subject: TypeSystem.structuraltypes.Subject with Logging{
//   type State = Int; def increment(): Unit} = $anon$1@6c75c3f5

// CHAPTER 21 스칼라 도구와 라이브러리

// 21.1 명령행 도구

// 21.1.1 scalac 명령행 도구

scalac <옵션> <소스 파일>


$ scala -Xlint
Welcome to Scala version 2.11.2 ...
...
scala> def hello = println("hello!")
<console>:7: warning: side-effecting nullary methods are discouraged:
    suggest defining as `def hello()` instead
       def hello = println("hello!")
           ^
hello: Unit


// 21.1.2 scala 명령행 도구

scala <옵션> [<스크립트|클래스|객체|jar> <인자>]


$ secho Hello World
// You entered: Hello World


// scalac에 대비한 scala의 한계

object Script {
  def main(args: Array[String]): Unit = {
    new AnyRef {
      // 스크립트 코드가 여기에 들어간다.
    }
  }
}


// 21.1.3 scalap와 javap 명령행 도구

scalap -cp . MessagePrinter

object MessagePrinter extends scala.AnyRef {
  def this() = { /* compiled code */ }
  def main(args: scala.Array[scala.Predef.String]): scala.Unit = {
    /* 컴파일한 코드 */
  }
}



javap -cp . MessagePrinter

Compiled from "example.sc"
public final class MessagePrinter {
  public static void main(java.lang.String[]);
}

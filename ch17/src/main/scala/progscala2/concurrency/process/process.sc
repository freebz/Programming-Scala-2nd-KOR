// src/main/scala/progscala2/concurrency/process/process.sc
import scala.sys.process._
import scala.language.postfixOps
import java.net.URL
import java.io.File

// 명령을 실행하고 출력을 stdout에 보낸다.
"ls -l src".!
// 합계 4
// drwxrwxr-x 3 fx fx 4096  3월 22 08:04 main
// res0: Int = 0

// 명령 토큰을 Seq로 넘기고, 출력 결과를 단일 문자열에 넣어서 돌려받는다.
Seq("ls", "-l", "src").!!
// res1: String =
// "합계 4
// drwxrwxr-x 3 fx fx 4096  3월 22 08:04 main
// "



// URL을 열기 위한 프로세스를 만들고, 그 출력을 'grep $filter'에 보낸다.
// 그리고 출력 결과를 파일에 덧붙인다(파일을 덮어쓰지 않는다).
def findURL(url: String, filter: String) =
  new URL(url) #> s"grep $filter" #>> new File(s"$filter.txt")

// 파일에 대해 ls -l을 실행한다. 해당 파일이 존재하면 줄 수를 센다.
def countLines(fileName: String) = s"ls -l $fileName" #&& s"wc -l $fileName"



findURL("http://scala-lang.org", "scala") !
// res2: Int = 0

countLines("scala.txt") !
// -rw-rw-r-- 1 fx fx 3226  3월 23 07:58 scala.txt
// 36 scala.txt
// res3: Int = 0

findURL("http://scala-lang.org", "scala") !
// res4: Int = 0

countLines("scala.txt") !
// -rw-rw-r-- 1 fx fx 6452  3월 23 07:59 scala.txt
// 72 scala.txt
// res5: Int = 0

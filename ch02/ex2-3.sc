// 2.12 타입과 멤버 임포트하기

import java.awt._
import java.io.FIle
import java.io.File._
import java.util.{Map, HashMap}

def stuffWithBigInteger() = {

  import java.math.BigInteger.{
    ONE => _,
    TEN,
    ZERO => JAVAZERO }

  // pirntln( "ONE: "+ONE )  // ONE은 결과적으로 정의되지 않은 상태가 된다.
  println( "TEN: "+TEN )
  println( "ZERO: "+JAVAZERO )
}


// 2.12.2 패키지 객체

static import com.example.json.JSON.*;  // java

import com.example.json._



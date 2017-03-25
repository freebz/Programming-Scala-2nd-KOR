// 15.7 자기 재귀 타입: F-바운드 다형성

public abstract class Enum<E extends Enum<E>>
    extends Object
  implements Comparable<E>, Serializable


int compareTo(E obj)


import java.util.concurrent.TimeUnit
import java.net.Proxy.Type

TimeUnit.MILLISECONDS compareTo TimeUnit.SECONDS
// res0: Int = -1

Type.HTTP compareTo Type.SOCKS
// res1: Int = -1

TimeUnit.MILLISECONDS compareTo Type.HTTP
// <console>:17: error: type mismatch;
//  found   : java.net.Proxy.Type(HTTP)
//  required: java.util.concurrent.TimeUnit
//        TimeUnit.MILLISECONDS compareTo Type.HTTP
//                                             ^

// 8.3 값 클래스

def toDigits(d: Digitizer, str: String) = d.digits(str)
  ...
val digs = toDigits(new USPhoneNumber("987-654-3210"), "123-Hello!-456")
// 결과: digs: String = 123456



def print[T](t: T) = println(t.toString)
print(new USPhoneNumber("987-654-3210"))
// 결과: (987) 654-3210

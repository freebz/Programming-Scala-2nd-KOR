// 8.6 클래스의 필드

class Name(var value: String)

class Name(s: String) {
  private var _value: String = s

  def value: String = _value

  def value_=(newValue: String): Unit = _value = newValue
}


val name = new Name("Buck")
name.value
name.value_=("Bubba")
name.value
name.value = "Hank"
name.value


object Pipeline {
  implicit class toPiped[V](value:V) {
    def |>[R] (f : V => R) = f(value)
  }
}


// 8.6.1 단일 접근 원칙

class Name2(s: String) {
  var value: String = s
}

val name2 = new Name2("Buck")
name2.value
name2.value_=("Bubba")
name2.value

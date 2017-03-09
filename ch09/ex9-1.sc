// CHAPTER 9 트레이트

// 9.2 믹스인으로서의 트레이트

trait PureAbstractTrait {
  def abstractMember(str: String): Int
}

abstract class AbstractClass {
  def concreteMember(str: String): Int = str.length
  def abstractMember(str: String): Int
}



observers ::= observer
observers = observer :: observers

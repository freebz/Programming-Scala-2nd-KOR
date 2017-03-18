// 14.5 추상 타입 이해하기

// 14.5.1 추상 타입과 매개변수화한 타입의 비교

case final class Some[+A](val value: A) { ... }


case final class Some(val value : ???) {
  type A
  ...
}

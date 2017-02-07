// 3.1 연산자 오버로딩?

1+2
1 toString


// 3.2 빈 인자 목록이 있는 메서드

def isEven(n: Int) = (n % 2) == 0

List(1, 2, 3, 4).filter((i: Int) => isEven(i)).foreach((i: Int) => println(i))
List(1, 2, 3, 4).filter(i => isEven(i)).foreach(i => println(i))
List(1, 2, 3, 4).filter(isEven).foreach(println)
List(1, 2, 3, 4) filter isEven foreach println


// 3.3 우선순위 규칙

2.0 * 4.0 / 3.0 * 5.0
(((2.0 * 4.0) / 3.0) * 5.0)

val list = List('b', 'c', 'd')
'a' :: list
list.::('a')

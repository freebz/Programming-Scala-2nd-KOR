// CHAPTER 16 고급 함수형 프로그래밍

// 16.1 대수적 데이터 타입

// 16.1.1 합 타입과 곱 타입

case class Person(name: Name, age: Age)

type unitTimesTuple2 = (Int, String, Unit)


// 16.1.2 대수적 데이터 타입의 특성

Unit x (Int,String) == (Int,String) x Unit
Breeds x (Int,String) == (Int,String) x Breeds
Nothing x (Int,String) == (Int,String) x Nothing

Nothing + (doberman, yorkie, ...) == (doberman, yorkie, ...) + Nothing
Unit    + (doberman, yorkie, ...) == (doberman, yorkie, ...) + Unit
Person  + (doberman, yorkie, ...) == (doberman, yorkie, ...) + Person

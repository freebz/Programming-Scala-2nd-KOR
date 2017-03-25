// CHAPTER 19 스칼라 동적 호출

// 19.1 동기를 불어넣는 예제: 루비 온 레일즈의 ActiveRecord

CREATE TABLE states (
  name      TEXT,      -- 주 이름
  capital   TEXt,      -- 주요 도시 이름
  statehood INTEGER    -- 주가 미국에 가입한 해
);


# 이름이 'Alaska'인 모든 주를 찾는다.
State.find_by_name("Alaska")
# 이름이 'Alaska'이면서 1959년에 미국에 가입한 모든 주를 찾는다.
State.find_by_name_and_statehood("Alaska", 1959)
...



// 19.2 Dynamic 트레이트를 사용해서 스칼라에서 동적 호출하기

foo.method("blah")     ~~> foo.applyDynamic("method")("blah")
foo.method(x = "blah") ~~> foo.applyDynamicNamed("method")(("x", "blah"))
foo.method(x = 1, 2)   ~~> foo.applyDynamicNamed("method")(("x", 1), ("", 2))
foo.field              ~~> foo.selectDynamic("field")
foo.varia = 10         ~~> foo.updateDynamic("varia")(10)
foo.arr(10) = 13       ~~> foo.selectDynamic("arr").update(10, 13)
foo.arr(10)            ~~> foo.applyDynamic("arr")(10)

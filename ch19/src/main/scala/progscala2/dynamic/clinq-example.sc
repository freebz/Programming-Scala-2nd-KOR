// src/main/scala/progscala2/dynamic/clinq-example.sc

import progscala2.dynamic.CLINQ
// import progscala2.dynamic.CLINQ

def makeMap(name: String, capital: String, statehood: Int) =
  Map("name" -> name, "capital" -> capital, "statehood" -> statehood)

// 미국의 다섯 주에 대한 '레코드'
val states = CLINQ(
  List(
    makeMap("Alaska",     "Juneau",      1959),
    makeMap("California", "Sacramento",  1850),
    makeMap("Illinois",   "Springfield", 1818),
    makeMap("Virginia",   "Richmond",    1788),
    makeMap("Washington", "Olympia",     1889)))
// states: dynamic.CLINQ[Any] =
// Map(name -> Alaska, capital -> Juneau, statehood -> 1959)
// Map(name -> California, capital -> Sacramento, statehood -> 1850)
// Map(name -> Illinois, capital -> Springfield, statehood -> 1818)
// Map(name -> Virginia, capital -> Richmond, statehood -> 1788)
// Map(name -> Washington, capital -> Olympia, statehood -> 1889)



states.name
// res0: dynamic.CLINQ[Any] =
// Map(name -> Alaska)
// Map(name -> California)
// Map(name -> Illinois)
// Map(name -> Virginia)
// Map(name -> Washington)

states.capital
// res1: dynamic.CLINQ[Any] =
// Map(capital -> Juneau)
// Map(capital -> Sacramento)
// Map(capital -> Springfield)
// Map(capital -> Richmond)
// Map(capital -> Olympia)

states.statehood
// res2: dynamic.CLINQ[Any] =
// Map(statehood -> 1959)
// Map(statehood -> 1850)
// Map(statehood -> 1818)
// Map(statehood -> 1788)
// Map(statehood -> 1889)

states.name_and_capital
// res3: dynamic.CLINQ[Any] =
// Map(name -> Alaska, capital -> Juneau)
// Map(name -> California, capital -> Sacramento)
// Map(name -> Illinois, capital -> Springfield)
// Map(name -> Virginia, capital -> Richmond)
// Map(name -> Washington, capital -> Olympia)

states.name_and_statehood
// res4: dynamic.CLINQ[Any] =
// Map(name -> Alaska, statehood -> 1959)
// Map(name -> California, statehood -> 1850)
// Map(name -> Illinois, statehood -> 1818)
// Map(name -> Virginia, statehood -> 1788)
// Map(name -> Washington, statehood -> 1889)

states.capital_and_statehood
// res5: dynamic.CLINQ[Any] =
// Map(capital -> Juneau, statehood -> 1959)
// Map(capital -> Sacramento, statehood -> 1850)
// Map(capital -> Springfield, statehood -> 1818)
// Map(capital -> Richmond, statehood -> 1788)
// Map(capital -> Olympia, statehood -> 1889)

states.all
// res6: dynamic.CLINQ[Any] =
// Map(name -> Alaska, capital -> Juneau, statehood -> 1959)
// Map(name -> California, capital -> Sacramento, statehood -> 1850)
// Map(name -> Illinois, capital -> Springfield, statehood -> 1818)
// Map(name -> Virginia, capital -> Richmond, statehood -> 1788)
// Map(name -> Washington, capital -> Olympia, statehood -> 1889)



states.all.where("name").NE("Alaska")
// res7: dynamic.CLINQ[Any] =
// Map(name -> California, capital -> Sacramento, statehood -> 1850)
// Map(name -> Illinois, capital -> Springfield, statehood -> 1818)
// Map(name -> Virginia, capital -> Richmond, statehood -> 1788)
// Map(name -> Washington, capital -> Olympia, statehood -> 1889)

states.all.where("statehood").EQ(1889)
// res8: dynamic.CLINQ[Any] =
// Map(name -> Washington, capital -> Olympia, statehood -> 1889)

states.name_and_statehood.where("statehood").NE(1850)
// res9: dynamic.CLINQ[Any] =
// Map(name -> Alaska, statehood -> 1959)
// Map(name -> Illinois, statehood -> 1818)
// Map(name -> Virginia, statehood -> 1788)
// Map(name -> Washington, statehood -> 1889)

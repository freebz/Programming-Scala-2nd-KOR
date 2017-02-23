// src/main/scala/progscala2/fp/datastructs/list.sc

val list1 = List("Programming", "Scala")
val list2 = "People" :: "should" :: "read" :: list1


val list3 = "Programming" :: "Scala" :: Nil
val list4 = "People" :: "should" :: "read" :: Nil


val list5 = list4 ++ list3

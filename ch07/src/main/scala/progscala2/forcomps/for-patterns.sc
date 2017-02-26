// src/main/scala/progscala2/forcomps/for-patterns.sc

val ignoreRegex = """^\s*(#.*|\s*)$""".r
val kvRegex = """^\s*([^=]+)\s*=\s*([^#]+)\s*.*$""".r

val properties = """
  |# 도서 프로퍼티
  |
  |book.name = Programming Scala, Second Edition # 주석
  |book.authors = Dean Wampler and Alex Payne
  |book.publisher = O'Reilly
  |book.publication-year = 2014
  |""".stripMargin

val kvPairs = for {
  prop <- properties.split("\n")
  if ignoreRegex.findFirstIn(prop) == None
  kvRegex(key, value) = prop
} yield (key.trim, value.trim)
// 반환: kvPairs: Array[(String, String)] = Array(
//   (book.name,Programming Scala, Second Edition),
//   (book.authors,Dean Wampler and Alex Payne),
//   (book.publisher,O'Reilly),
//   (book.publication-year,2014))

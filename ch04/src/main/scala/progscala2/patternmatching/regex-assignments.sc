// src/main/scala/progscala2/patternmatching/regex-assignments.sc

val cols = """\*|[\w, ]+""" // 컬럼
val table = """\w+"""      // 테이블 이름
val tail = """.*"""         // 기타

val selectRE =
  s"""SELECT\\s*(DISTINCT)?\\s+($cols)\\s*FROM\\s+($table)\\s*($tail)?;""".r

val selectRE(distinc1, cols1, table1, otherClauses) =
  "SELECT DISTINCT * FROM atable;"

val selectRE(distinc2, cols2, table2, otherClauses) =
  "SELECT col1, col2 FROM atable;"

val selectRE(distinc3, cols3, table3, otherClauses) =
  "SELECT DISTINCT col1, col2, FROM atable;"

val selectRE(distinc4, cols4, table4, otherClauses) =
  "SELECT DISTINCT cla1, col2 FROM atable WHERE col1 = 'foo';"

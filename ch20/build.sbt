name := "Programming Scala, Second Edition - Code examples"

version := "2.1"

organization := "org.programming-scala"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.2",
  "org.scala-lang.modules" %% "scala-xml"       % "1.0.2",
  "org.scalacheck"         %% "scalacheck"      % "1.12.5" % "test",
  "org.scalatest"          %% "scalatest"       % "2.2.4"  % "test"
)

name := "Programming Scala, Second Edition - Code examples"

version := "2.1"

organization := "org.programming-scala"

libraryDependencies ++= Seq(
  "org.scala-lang"          % "scala-reflect"   % scalaVersion.value,
  "org.scalatest"          %% "scalatest"       % "2.2.4"  % "test"
)

name := "Programming Scala, Second Edition - Code examples"

version := "2.1"

organization := "org.programming-scala"

libraryDependencies ++= Seq(
  "org.scalatest"          %% "scalatest"       % "2.2.4"  % "test",
  // JUnit is used for some Java interop. examples. A driver for JUnit:
  "junit"                   % "junit-dep"       % "4.10"   % "test"
)

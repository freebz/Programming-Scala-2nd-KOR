// 21.2.1 스칼라 표준 빌드 도구 SBT

name := "Programming Scala, Second Edition: Code examples"

version := "2.0"

organization := "org.programming-scala"

scalaVersion := "2.11.2"



libraryDependencies ++= Seq(
  "com.typesafe.akka"      %% "akka-actor"    % "2.3.4",
  "org.scalatest"          %% "scalatest"     % "2.2.1"  % "test",
  "org.scalacheck"         %% "scalacheck"    % "1.11.5" % "test",
  ...
)



scalacOptions = Seq(
  "-encoding",  "UTF-8", "-optimise",
  "-deprecation", "-unchecked", "-feature", "-Xlint", "-Ywarn-infer-any")

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")



initialCommands in console := """
  |import foo.bar._
  |import foo.bar.baz._
  |""".stripMargin



initialCommands in console := """println("Hello from console")"""
initialCommands in consoleQuick := """println("Hello from consoleQuick")"""
initialCommands in consoleProject := """println("Hello from consoleProject")"""

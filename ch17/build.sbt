name := "Programming Scala, Second Edition - Code examples"

version := "2.1"

organization := "org.programming-scala"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-async"     % "0.9.2",
  "com.typesafe.akka"      %% "akka-actor"      % "2.3.4",
  "com.typesafe.akka"      %% "akka-slf4j"      % "2.3.4"
)

// src/main/scala/progscala2/introscala/uppeer2.scala

object Upper {
  def upper(strings: String*) = strings.map(_.toUpperCase())
}

println(Upper.upper("Hello", "World!"))

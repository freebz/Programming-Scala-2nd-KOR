// src/main/scala/progscala2/typesystem/valuetypes/object-types.sc

case object Foo { override def toString = "Foo says Hello!" }


def printFoo(foo: Foo.type) = println(foo)
// printFoo: (foo: Foo.type)Unit

printFoo(Foo)
// Foo says Hello!

// 5.7 스칼라가 기본 제공하는 암시

object Int {
  ...
  implicit def int2long(x: Int): Long = x.toLong
    ...
}



// Byte

implicit def byte2short(x: Byte): Short = x.toShort
implicit def byte2int(x: Byte): Int = x.toInt
implicit def byte2long(x: Byte): Long = x.toLong
implicit def byte2float(x: Byte): Float = x.toFloat
implicit def byte2double(x: Byte): Double = x.toDouble



// Char

implicit def char2int(x: Char): Int = x.toInt
implicit def char2long(x: Char): Long = x.toLong
implicit def char2float(x: Char): Float = x.toFloat
implicit def char2double(x: Char): Double = x.toDouble



// Short

implicit def short2int(x: Short): Int = x.toInt
implicit def short2long(x: Short): Long = x.toLong
implicit def short2float(x: Short): Float = x.toFloat
implicit def short2double(x: Double): Double = x.toDouble



// Int

implicit def int2long(x: Int): Long = x.toLong
implicit def int2float(x: Int): Float = x.toFloat
implicit def int2double(x: Int): Double = x.toDouble



// Long

implicit def long2float(x: Long): Float = x.toFloat
implicit def long2double(x: Long): Double = x.toDouble



// Float

implicit def float2double(x: Float): Double = x.toDouble



// BigDecimal

implicit def int2bigDecimal(i: Int): BigDecimal = apply(i)
implicit def long2bigDecimal(l: Long): BigDecimal = apply(l)
implicit def double2bigDecimal(d: Double): BigDecimal = ...
implicit def javaBigDecimal2bigDeciaml(x: BigDec): BigDecimal = apply(x)



// BigInt

implicit def int2bigInt(i: Int): BigInt = apply(i)
implicit def long2bigInt(l: Long): BigInt = apply(l)
implicit def javaBigInteger2bigInt(x: BigInteger): BigInt = apply(x)



// Option

implicit def option2Iterable[A](xo: Option[A]): Iterable[A] = xo.toList



// Predef

@inline implicit def augmentString(x: String): StringOps = new StringOps(x)
@inline implicit def unaugmentString(x: StringOps): String = x.repr
implicit def tuple2ToZippedOps[T1, T2](x: (T1, T2))
  = new runtime.Tupe2Zipped.Ops(x)
implicit def tuple3ToZippedOps[T1, T2, T3](x: (T1, T2, T3))
  = new rumtime.Tupe3Zipped.Ops(x)
implicit def genericArrayOps[T](xs: Array[T]): ArrayOps[T] = ...

implicit def booleanArrayOps(xs: Array[Boolean]): ArrayOps[Boolean] =
  = new ArrayOps.ofBoolean(xs)
    ...   // 다른 AnyVal 타입에 대해서도 비슷한 함수가 더 있다.
implicit def refArrayOps[T <: AnyRef](xs: Array[T]): ArrayOps[T]
= new ArrayOps.ofRef[T](xs)

@inline implicit def byteWrapper(x: Byte) = new runtime.RichByte(x)
  ...     // 다른 AnyVal 타입에 대해서도 비슷한 함수가 더 있다.

implicit def genericWrapArray[T](xs: Array[T]): WrappedArray[T] = ...
implicit def wrapRefArray[T <: AnyRef](xs: Array[T]): WrappedArray[T] = ...
implicit def wrapIntArray(xs: Array[Int]): WrappedArray[Int] = ...
  ...     // 다른 AnyVal 타입에 대해서도 비슷한 함수가 더 있다.

implicit def wrapString(s: String): WrappedString = ...
implicit def unwrapString(ws: WrappedString): String = ...



val zipped = List(1,2,3) zip List(4,5,6)

val products = zipped map { case(x,y) => x * y }


var pair = (List(1,2,3), List(4,5,6))
val unpair = pair.invert

val pair = (List(1,2,3), List("one", "two", "three"))
tuple2ToZippedOps(pair) map { case (int, string) => (int*2, string.toUpperCase)}

val pair = (List(1,2,3), List(4,5,6))
pair map { case (int1, int2) => int1 + int2 }




// Predef

implicit def byte2Byte(x: Byte) = java.lang.Byte.valueOf(x)
implicit def Byte2byte(x: java.lang.Byte): Byte = x.byteValue
  ...     // 다른 AnyVal 타입에 대해서도 비슷한 함수가 더 있다.




// Predef

implicit def conforms[A]: A <:< A = ...
implicit def tpEquals[A]: A =:= A = ...



// Random

implicit def javaRandomToRandom(r: java.util.Random): Random = new Random(r)



// scala.collection.convert

implicit def asJavaIteratorConverter[A](i: Iterator[A]):
    AsJava[ju.Iterator[A]] = ...
implicit def asJavaEnumerationConverter[A](i: Iterator[A]):
    AsJavaEnumeration[A] = ...
implicit def asJavaIterableConverter[A](i: Iterable[A]):
    AsJava[jl.Iterable[A]] = ...
implicit def asJavaCollectionConverter[A](i: Iterable[A]):
    AsJavaCollection[A] = ...
implicit def bufferAsJavaListConverter[A](b: mutable.Buffer[A]):
    AsJava[ju.List[A]] = ...
implicit def mutableSeqAsJavaListConverter[A](b: mutable.Seq[A]):
    AsJava[ju.List[A]] = ...
implicit def seqAsJavaListConverter[A](b: Seq[A]):
    AsJava[ju.List[A]] = ...
implicit def mutableSetAsJavaSetConverter[A](s: mutable.Set[A]):
    AsJava[ju.Set[A]] = ...
implicit def setAsJavaSetConverter[A](s: Seq[A]):
    AsJava[ju.Set[A]] = ...
implicit def mutableMapAsJavaMapConverter[A, B](m: mutable.Map[A, B]):
    AsJava[ju.Map[A, B]] = ...
implicit def asJavaDictionaryConverter[A, B](m: mutable.Map[A, B]):
    AsJavaDictionary[A, B]] = ...
implicit def mapAsJavaMapConverter[A, B](m: Map[A, B]):
    AsJava[ju.Map[A, B]] = ...
implicit def mapAsJavaConcurrentMapConverter[A, B](m: concurrent.Map[A, B]):
    AsJava[juc.ConcurrentMap[A, B]] = ...



// DecorateAsScala

implicit def asScalaIteratorConverter[A](i: ju.Iterator[A]):
    AsScala[Iterator[A]] = ...
implicit def enumerationAsScalaIteratorConverter[A](i: ju.Enumeration[A]):
    AsScala[Iterator[A]] = ...
implicit def iterableAsScalaIterableConverter[A](i: jl.Iterable[A]):
    AsScala[Iterable[A]] = ...
implicit def collectionAsScalaIterableConverter[A](i: ju.Collection[A]):
    AsScala[Iterable[A]] = ...
implicit def asScalaBufferConverter[A](l: ju.List[A]):
    AsScala[mutable.Buffer[A]] = ...
implicit def asScalaSetConverter[A](s: ju.Set[A]):
    AsScala[mutable.Set[A]] = ...
implicit def mapAsScalaMapConverter[A, B](m: ju.Map[A, B]):
    AsScala[mutable.Map[A, B]] = ...
implicit def mapAsScalaConcurrentMapConverter[A, B](m: juc.ConcurrentMap[A, B]):
    AsScala[concurrent.Map[A, B]] = ...
implicit def dictionaryAsScalaMapConverter[A, B](p: ju.Dictionary[A, B]):
    AsScala[mutable.Map[A, B]] = ...
implicit def propertiesAsScalaMapConverter(p: ju.Properties):
    AsScala[mutable.Map[String, String]] = ...


import scala.collection.JavaConverters._



// WrapAsJava

implicit def asJavaIterator[A](it: Iterator[A]): ju.Iterator[A] = ...
implicit def asJavaEnumeration[A](it: Iterator[A]): ju.Enumeration[A] = ...
implicit def asJavaIterable[A](i: Iterable[A]): jl.Iterable[A] = ...
implicit def asJavaCollection[A](it: Iterable[A]): ju.Collection[A] = ...
implicit def bufferAsJavaList[A](b: mutable.Buffer[A]): ju.List[A] = ...
implicit def mutableSeqAsJavaList[A](seq: mutable.Seq[A]): ju.List[A] = ...
implicit def seqAsJavaList[A](seq: Seq[A]): ju.List[A] = ...
implicit def mutableSetAsJavaSet[A](s: mutable.Set[A]): ju.Set[A] = ...
implicit def setAsJavaSet[A](s: Set[A]): ju.Set[A] = ...
implicit def mutableMapAsJavaMap[A, B](m: mutable.Map[A, B]): ju.Map[A, B] = ...
implicit def asJavaDictionary[A, B](m: mutable.Map[A, B]): ju.Dictionary[A, B]
implicit def mapAsJavaMap[A, B](m: Map[A, B]): ju.Map[A, B] = ...
implicit def mapAsJavaConcurrentMap[A, B](m: concurrent.Map[A, B]):
    juc.ConcurrentMap[A, B] = ...



// WrapAsScala

implicit def asScalaIterator[A](it: ju.Iterator[A]): Iterator[A] = ...
implicit def enumerationAsScalaIterator[A](i: ju.Enumeration[A]):
    Iterator[A] = ...
implicit def iterableAsScalaIterable[A](i: jl.Iterable[A]): Iterable[A] = ...
implicit def collectionAsScalaIterable[A](i: ju.Collection[A]): Iterable[A] = ...
implicit def asScalaBuffer[A](l: ju.List[A]): mutable.Buffer[A] = ...
implicit def asScalaSet[A](s: ju.Set[A]): mutable.Set[A] = ...
implicit def mapAsScalaMap[A, B](m: ju.Map[A, B]): mutable.Map[A, B] = ...
implicit def mapAsScalaConcurrentMap[A, B](m: juc.ConcurrentMap[A, B]):
    concurrent.Map[A, B] = ...
implicit def dictionaryAsScalaMap[A, B](m: ju.Dictionary[A, B]):
    mutable.Map[A, B] = ...
implicit def propertiesAsScalaMap(p: ju.Properties):
    mutable.Map[String, String] = ...
  [source,scala]


import scala.collection.JavaConversions._



// Ordering

implicit def ordered[A <% Comparable[A]]: Ordering[A] = ...
implicit def comparatorToOrdering[A](implicit c: Comparator[A]):Ordering[A]=...
implicit def seqDerivedOrdering[CC[X] <: scala.collection.Seq[X], T](
  implicit ord: Ordering[T]): Ordering[CC[T]] = ...
implicit def infixOrderingOps[T](x: T)(implicit ord: Ordering[T]):
    Ordering[T]#Ops = ...
implicit def Option[T](implicit ord: Ordering[T]): Ordering[Option[T]] = ...
implicit def Iterable[T](implicit ord: Ordering[T]): Ordering[Iterable[T]] = ...
implicit def Tuple2[T1, T2](implicit ord1: Ordering[T1], ord2: Ordering[T2]):
    Ordering[(T1, T2)] = ...
  ...     // Tuple3부터 Tuple9까지 비슷한 함수가 있다.



// scala.concurrent.duration

implicit def pairIntToDuration(p: (Int, TimeUnit)): Duration = ...
implicit def pairLongToDuration(p: (Long, TimeUnit)): FiniteDuration = ...
implicit def durationToPair(d: Duration): (Long, TimeUnit) = ...



// scala.concurrent

// scala.concurrent.FutureTaskRunner:
implicit def futureAsFunction[S](x: Future[S]): () => S

// scala.concurrent.JavaConversions:
implicit def asExecutionContext(exec: ExecutionService):
    ExecutionContextExecutorService = ...
implicit def asExecutionContext(exec: Executor): ExecutionContextExecutor = ...

// scala.concurrent.Promise:
private implicit def internalExecutor: ExecutionContext = ...

// scala.concurrent.TaskRunner:
implicit def functionAsTask[S](fun: () => S): Task[S] = ...

// scala.concurrent.ThreadPoolRunner:
implicit def functionAsTask[S](fun: () => S): Task[S] = ...
implicit def futureAsFunction[S](x: Future[S]): () => S = ...



// Process

implicit def buildersToProcess[T](builders: Seq[T])(
  implicit convert: T => Source): Seq[Source] = ...
implicit def builderToProcess(builder: JProcessBuilder): ProcessBuilder = ...
implicit def fileToProcess(file: File): FileBuilder = ...
implicit def urlToProcess(url: URL): URLBuilder = ...
implicit def stringToProcess(command: String): ProcessBuilder = ...
implicit def stringSeqToProcess(command: Seq[String]): ProcessBuilder = ...

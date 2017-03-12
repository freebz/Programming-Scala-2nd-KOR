// 10.5 Predef 객체

// 10.5.1 암시적 변환

@inline implicit def byteWrapper(x: Byte)       = new runtime.RichByte(x)
@inline implicit def shortWrapper(x: Short)     = new runtime.RichShort(x)
@inline implicit def intWrapper(x: Int)         = new runtime.RichInt(x)
@inline implicit def charWrapper(x: Char)       = new runtime.RichChar(x)
@inline implicit def longWrapper(x: Long)       = new runtime.RichLong(x)
@inline implicit def floatWrapper(x: Floaat)    = new runtime.RichFloat(x)
@inline implicit def doubleWrapper(x: Double)   = new runtime.RichDouble(x)
@inline implicit def booleanWrapper(x: Boolean) = new runtime.RichBoolean(x)


implicit def wrapIntArray(xs: Array[Int]): WrappedArray[Int]
implicit def wrapDoubleArray(xs: Array[Double]): WrappedArray[Double]
implicit def wrapLongArray(xs: Array[Long]): WrappedArray[Long]
implicit def wrapFloatArray(xs: Array[Float]): WrappedArray[Float]
implicit def wrapCharArray(xs: Array[Char]): WrappedArray[Char]
implicit def wrapByteArray(xs: Array[Byte]): WrappedArray[Byte]
implicit def wrapShortArray(xs: Array[Short]): WrappedArray[Short]
implicit def wrapBooleanArray(xs: Array[Boolean]): WrappedArray[Boolean]
implicit def wrapUnitArray(xs: Array[Unit]): WrappedArray[Unit]


implicit def wrapString(s: String): WrappedString
implicit def unwrapString(ws: WrappedString): String

implicit def augmentString(x: String): StringOps
implicit def unaugmentString(x: StringOps): String


implicit def byte2Byte(x: Byte)          = java.lang.Byte.valueOf(x)
implicit def short2Short(x: Short)       = java.lang.Short.valueOf(x)
implicit def char2Character(x: Char)     = java.lang.Character.valueOf(x)
implicit def int2Integer(x: Int)         = java.lang.Integer.valueOf(x)
implicit def long2Long(x: Long)          = java.lang.Long.valueOf(x)
implicit def float2Float(x: Float)       = java.lang.Float.valueOf(x)
implicit def double2Double(x: Double)    = java.lang.Double.valueOf(x)
implicit def boolean2Boolean(x: Boolean) = java.lang.Boolean.valueOf(x)

implicit def Byte2byte(x: java.lang.Byte): Byte             = x.byteValue
implicit def Short2short(x: java.lang.Short): Short         = x.shortValue
implicit def Character2char(x: java.lang.Character): Char   = x.charValue
implicit def Integer2int(x: java.lang.Integer): Int         = x.intValue
implicit def Long2long(x: java.lang.Long): Long             = x.longValue
implicit def Float2float(x: java.lang.Floaat): Float        = x.floatValue
implicit def Double2double(x: java.lang.Double): Double     = x.doubleValue
implicit def Boolean2boolean(x: java.lang.Boolean): Boolean = x.booleanValue


implicit def Byte2byteNullConflict(x: Null): Byte = sys.error("value error")

val b: Byte = null
// <console>:10: error: an expression of type Null is ineligible for implicit conversion
//        val b: Byte = null
//                      ^



// 10.5.2 타입 정의

type Map[A, +B]       = collection.immutable.Map[A, B]
type Set[A]           = collection.immutable.Set[A]
type Function[-A, +B] = Function1[A, B]


type Pair[+A, +B]       = Tuple2[A, B]
type Triple[+A, +B, +C] = Tuple3[A, B, c]

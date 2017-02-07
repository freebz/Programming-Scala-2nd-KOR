// 3.13 문자열 인터폴레이션

val name = "Buck Trends"
println(s"Hello, $name")

val gross   = 100000F
val net     = 64000F
val percent = (net / gross) * 100
println(f"$$${gross}%.2f vs. $$${net}%.2f or ${percent}%.1f%%")

val i = 200
f"${i}%.2f"
val d = 100.22
f"${d}%2d"

val s = "%02d: name = %s".format(5, "Dean Wampler")

val name = "Dean Wampler"
s"123\n$name\n456"
raw"123\n$name\n456"

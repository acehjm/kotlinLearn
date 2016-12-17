
class HiKotlin{
    val c = "Hello"
    val s = "Kotlin"

    fun p(){
        println("$c $s.")
    }

    fun double(x: Double = 10.0): Double {
        return x
    }

}

fun main(args: Array<String>) {
    HiKotlin().p()
    println(HiKotlin().double())
    println(1 shl 3)

    key()

    println(max(2, 4))

    println(getStringLength(2323))

    cases(12L)
}

fun cases(obj: Any) {
    when (obj) {
        1 -> print("one")
        "hello" -> print("Greeting")
        is Long -> print("Long")
        !is String -> print("Not a String")
        else -> print("Unknown")
    }
}

fun key() {
    val items = listOf(1, 2, 3)
    val icc = emptyList<Int>()
    println(items + icc)
    println("bye bye")
}

fun max(a: Int,  b: Int) = if (a > b) a else b

fun getStringLength(obj: Any): Int? {
    if (obj is String)
        return obj.length
    return null
}
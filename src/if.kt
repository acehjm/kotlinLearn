fun main(args: Array<String>) {
    println(foo(4))
    println(arrOfMinusOnes(8).get(4))
}

fun foo(param: Int): String {
    val result = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else {
        "three"
    }
    return result
}

fun arrOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}
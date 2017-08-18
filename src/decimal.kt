fun main(args: Array<String>) {
    val d = decimalDigitValue('7')
    println(d)

    arrayInt()
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt()
}

fun arrayInt() {
    val x: IntArray = intArrayOf(1, 2, 3)
    if (x[2] == x[0] + x[1]) print(true) else print(false)
}
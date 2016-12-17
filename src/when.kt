fun main(args: Array<String>) {

    println(transform("Blue"))
    println(transform2("Red"))
    decimalDigitValue('c')
}

fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Blue" -> 1
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}

fun transform2(color: String): Int = when (color) {
    "Red" -> 0
    "Blue" -> 1
    else -> throw IllegalArgumentException("Invalid color param value")
}

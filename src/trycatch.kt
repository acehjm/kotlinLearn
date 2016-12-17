fun main(args: Array<String>) {

    trycatch()
}

fun trycatch() {
    val result = try {
        "ccc"
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
    print(result)
}
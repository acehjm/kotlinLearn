fun <T> asList(vararg ts: T): List<T> {
    val result = ts.toList()
    return result
}

fun main(args: Array<String>) {
    val list = asList(1, 2, 3, 4)
    println(list)
}
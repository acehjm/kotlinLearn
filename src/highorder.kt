fun highTest(num: Int, body: () -> Int): Int {
    return if (num > 0)
        num
    else
        body()
}

fun <T, R> List<T>.mymap(transform: (T) -> R): List<R> {
    return this.map { transform(it) }
}

inline fun <T> mymax(collection: Collection<T>, less: (T, T) -> Boolean): T? {
    var max: T? = null
    for (c in collection)
        if (max == null || less(max, c))
            max = c
    return max
}

fun main(args: Array<String>) {
    val h = highTest(-8) { 3 }
    println("high test result: $h")
    println("---------------------")

    val result = listOf(1, 2, 3).mymap { i -> i * i }
    println("result: $result")

    println("--------------------------")
    val maxInt = mymax(listOf(1, 2, 3), { a, b -> a < b })
    val maxStr = mymax(listOf("1", "22", "333"), { a, b -> a.length < b.length })
    println("maxInt: $maxInt, maxStr: $maxStr")

    println("--------------------------")
    val sum = fun Int.(other: Int): Int = this + other
    println("sum: ${2.sum(3)}")
}
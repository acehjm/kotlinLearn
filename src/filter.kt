

fun main(args: Array<String>) {
    val a = mutableListOf("a", "b", "c")
    val b = mutableListOf("c", "d", "e")

    a.filter { !b.contains(it) }.forEach(::println)
}
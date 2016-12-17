fun main(args: Array<String>) {
    //val readonly
    val map1 = mapOf("a" to 1, "b" to 2, "c" to 3)
    map1.plus("d" to 4)
    for ((k, v) in map1) println("$k -> $v")

    println("-------------")
    val map2 = mapOf(1 to "a", 2 to "b", 3 to "c")
    map2.plus(5 to "e")
    for ((k, v) in map2) println("$k -> $v")
}

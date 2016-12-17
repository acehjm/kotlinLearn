/**
 * 循环
 *
 * @author
 * @date 2016-12-13 20:59
 */

fun main(args: Array<String>) {

    forloop()
    whileloop()
    whenloop(12)
    ranges(2, 4)
    collections()
}

fun forloop() {
    val vv = listOf(1,2,3)
    for (i in vv)
        print(i)

    println()

    for (i in vv.indices)
        print(vv[i])
}

fun whileloop() {
    var i = 0
    while (i <= 5) {
        println(i)
        i++
    }
}

fun whenloop(obj: Any) {
    when (obj) {
        1 -> println("one")
        "kotlin" -> println("good language")
        is Long -> println("Long")
        else -> println("Unknown")
    }
}

fun ranges(x: Int, y: Int) {
    if (x in 1..y - 1)
        println("Ok")

    val arrs = listOf(4, 5, 6)
    if (x !in 4..arrs.lastIndex)
        println("Out")
}

fun collections() {
    println("--------------------")
    val names = listOf("a", "B", "c", "D", "e")
    if ("c" in names) println("Yes")

    names
            .sortedBy { it }
            .map{ it.toUpperCase()}
            .forEach{ print(it) }
}
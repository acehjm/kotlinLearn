fun main(args: Array<String>) {
    println(jumps())
    println()
    foo()
    println()
    foo1()
    println()
    foo2()
    println()
    println(breaktest())
}

/*跳转到循环的下一次迭代*/
fun jumps(): Int {
    var count = 0
    loop@ for (i in 1..10) {
        for (j in 4..9) {
            if (i > j)
                count++
            continue@loop
        }
    }
    return count
}

/*结束最近的闭合循环*/
fun foo() {
    val ints = listOf(1, 2, 3)

    ints.forEach {
        if (it == 3) return
        println(it)
    }
}

fun foo1() {
    val ints = listOf(1, 2, 3)

    ints.forEach lit@ {
        if (it == 1) return@lit
        println(it)
    }
}

fun foo2() {
    val ints = listOf(1, 2, 3)

    ints.forEach {
        if (it == 1) return@forEach
        println(it)
    }
}

/*跳转标签后面的表达式*/
fun breaktest(): Int {
    var count = 0
    loop@ for (i in 1..50) {
        for (j in 50..100) {
            if (i > j) {
                count++
                break@loop
            }
        }
    }
    return count
}
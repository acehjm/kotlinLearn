fun main(args: Array<String>) {
    println(jumps())
    println()
    foo()
    println()
    foo1()
    println()
    foo2()
}

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
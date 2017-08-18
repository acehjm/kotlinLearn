fun my_collection() {
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyView: List<Int> = numbers

    println(numbers)

    numbers.add(4)
    println(readOnlyView)

    val strings = hashSetOf("a", "b", "b", "c", "d", "b")
    println(strings.size)
}

fun main(args: Array<String>) {
    my_collection()
    println("------------------")
    my_collection2()
    println("-------------------")
    concat()
}

fun concat() {
    val list1 = mutableListOf(1, 2, 3)
    val list2 = mutableListOf(4, 5, 6)
    list1.addAll(2, list2)
    println(list1)
}

fun my_collection2() {
    val items = listOf(1, 2, 3, 4)
    println(items.first())
    println(items.last())
    println(items.filter { it % 2 == 0 })

    val rwList = mutableListOf(1, 2, 3)
    rwList.requireNoNulls()
    if (rwList.none() { it > 6 })
        println("No items above 6")

    val item = rwList.firstOrNull()
    println(item)
}
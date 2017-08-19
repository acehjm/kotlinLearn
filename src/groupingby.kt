fun main(args: Array<String>) {
    val words = "one two three four five six seven eight nine ten".split(' ')

    println("words: $words")

    val frequencies = words.groupingBy { it.first() }.eachCount()

    println("Counting first letters: $frequencies.")

    // 另一种方式是使用“groupBy”和“mapValues”创建一个中间的映射，
    // 而“groupingBy”的方式会即时计数。
    val groupBy = words.groupBy { it.first() }.mapValues { (_, list)-> list.size }
    println("comparing the result with using 'groupby': ${groupBy == frequencies}.")
}
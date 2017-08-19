fun a(): Array<String> {
    return Array(10, {i -> (i * i).toString()})
}

fun main(args: Array<String>) {
    println(a()[2])
    a().forEach(::println)

    println("contentToString: ${arrayOf("a", "b", "a", "c").joinToString("")}")
}
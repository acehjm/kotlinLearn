fun main(args: Array<String>) {
    val input = "kotlin"
    val keyword = "in"

    val index = input.indexOf(keyword).takeIf { it > 0 } ?: error("keyword not found")

    require (keyword.length >= 0) { "Count 'n' must be non-negative, but was ${keyword.length}." }

    println("'$keyword' was found in '$input'")
    println(input)
    println(" ".repeat(index) + "^")
}
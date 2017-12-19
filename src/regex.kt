fun main(args: Array<String>) {
    val regex = "^[A-Z]{1,4}$".toRegex()

    println("FALSE: ${regex.matches("020")}")
    println("FALSE: ${regex.matches("")}")
    println("FALSE: ${regex.matches("PMPMPM")}")
    println("FALSE: ${regex.matches("*%DD")}")
    println("FALSE: ${regex.matches("pmp")}")
    println("---------------------------")
    println("TRUE: ${regex.matches("P")}")
    println("FALSE: ${regex.matches("ITEM")}")
    println("FALSE: ${regex.matches("P  M R ")}")

    println("************************")
    val regex2 = "^\\d{3}$".toRegex()
    println("FALSE: ${regex2.matches("0200")}")
    println("FALSE: ${regex2.matches("abx")}")
    println("FALSE: ${regex2.matches("0")}")
    println("----------------------")
    println("TRUE: ${regex2.matches("000")}")
}
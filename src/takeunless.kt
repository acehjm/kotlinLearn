fun testTaskUnless(string: String){
    val result = string.takeUnless(String::isEmpty)

    println("string = \"$string\"; result = \"$result\"")
}

fun main(args: Array<String>) {
    testTaskUnless("")
    testTaskUnless("kotlin")
}
fun main(args: Array<String>) {
    /*val x: String? = "aa" as? String
    println(x)

    val y: String = 2 as String
    println(y)*/

    foo("cc", "cc")
}


fun foo(a: String?, b: Any?) {
    println(a?.equals(b) ?: (b === null)) //a==b
    println(a == b)
}
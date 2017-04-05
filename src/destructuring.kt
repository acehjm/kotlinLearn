data class Result(var one: String, var two: Int)

var result: Result = Result("one", 2)


fun main(args: Array<String>) {
    val (one, two) = result
    println("one: $one, two: $two")

    //map
    for ((o, t) in rs)
        println("$o.$t")

}


var r1: Result = Result("aa", 1)
var r2: Result = Result("bb", 2)
var r3: Result = Result("cc", 3)
var r4: Result = Result("dd", 4)
var r5: Result = Result("ee", 5)

val rs = listOf(r1, r2, r3, r4, r5)
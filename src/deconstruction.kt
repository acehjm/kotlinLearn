data class Response(val value: Any, val status: String)

fun getResponse() = Response(22, "ok").also { println("getResponse() returns $it") }

fun main(args: Array<String>) {
    val (_, status) = getResponse()

    println("status is '$status'")
}
inline fun MutableMap<String, Any>.builder(body: Map<String, Any>.() -> Pair<String, Any>): MutableMap<String, Any> {
    val m = this.body()
    this.put(m.first, m.second)
    return this
}

fun main(args: Array<String>) {
    val b = mutableMapOf<String, Any>()
            .builder {
                "a" to 1
                "b" to 2
                "c" to 3
            }
    println(b)

    println("----------------------------")
}

data class dymap(val key: String, val value: Any)
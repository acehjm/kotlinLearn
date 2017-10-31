sealed class AA(
        var name: String = "",
        var id: String = ""
)

sealed class BB(
        var desc: String = ""
) : AA()

data class CC(
        var ref: String = ""
) : BB()

fun cc(init: CC.() -> Unit): CC = CC().apply(init)

fun main(args: Array<String>) {
    val c = cc {
        id = "00001"
        name = "world"
        desc = "this is 2b"
        ref = "ref 22"
    }
    println("cc: ${c.name}")
}
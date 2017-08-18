
class Anonymous {

    fun cc(aa: String): String {
        var k: String = "00"
        println("aa $aa")
        fun rev(oo: String) {
            println(oo)
            if (aa == "11") k = "33"
        }

        rev("----")
        return k
    }

}

fun main(args: Array<String>) {
    val a = Anonymous()
    println(a.cc("11"))
}
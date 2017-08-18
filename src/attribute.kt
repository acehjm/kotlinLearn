
class Attribute {
    var setterVisibilite: String = "abc"
        get

    var setterWithAnnotation: Any? = "cc"
    fun vv() {
        println(Int.MIN_VALUE)
    }
}

fun main(args: Array<String>) {
    val a = Attribute()

    a.vv()
    println(a.setterVisibilite.get(0))

    D().foo()
    D().foo(4)
}

class D {
    fun foo() {
        println("c")
    }
}

fun D.foo() {
    println("D")
}

fun D.foo(i: Int) {
    println("$i")
}

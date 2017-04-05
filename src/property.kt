var x = 1

class A(val p: Int)

val String.lastChar: Char
    get() = this[length - 1]

fun main(args: Array<String>) {
    println(::x.get())
    ::x.set(2)
    println(x)

    x = 4
    println(x)

    val prop = A::p
    println(prop.get(A(5)))

    println(String::lastChar.get("abc"))
}
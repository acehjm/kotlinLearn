class Customer(name: String) {
    init {
        println("Your name: $name")
    }

    constructor(name: String, age: Int) : this(name) {
        println("your name: $name, and age: $age")
    }
}

class Others : Base() {

}

fun main(args: Array<String>) {
    Customer("sb", 17)

    Others().nv()

    Derived().v()
}

open class Base {
    open fun v() {
        println("I'm Base")
    }

    fun nv() {
        println("I'm ok")
    }
}

class Derived() : Base() {
    override fun v() {
        println("I'll override you")
    }
}
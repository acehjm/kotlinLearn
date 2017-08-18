import kotlin.properties.Delegates

/*
* 可观察属性
* Delegates.observable()函数接受两个参数：
* 第一个是初始化值，第二个是属性值变化事件的响应器(handler).
* 每次我们向属性赋值时，响应器(handler)都会被调用(在属性赋值处理完成之后).
* 响应器收到三个参数：被赋值的属性，赋值前的旧属性值，以及赋值后的新属性值。
* */

class User {
    var name: String by Delegates.observable("<no name>") { _, old, new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "java"
    user.name = "Kotlin"
    user.name = "python"
}
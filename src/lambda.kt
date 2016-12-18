val sum = fun Int.(other: Int): Int = this + other

fun main(args: Array<String>) {
    println(1.sum(2))

    h
}

class HTML {
    fun body() {
        println("im body")
    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()  // 创建接受者对象
    html.init()        // 将接受者对象传递给 Lambda 表达式
    return html
}


val  h = html {   // 带接受者的 Lambda 表达式从这里开始
    body()   // 调用接受者对象上的一个方法
}
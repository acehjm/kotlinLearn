import kotlin.reflect.KProperty

/*
*  委托属性
*  --延迟加载属性(lazy property): 属性值只在的初次访问时才会计算;
*  --可观察属性(observable property): 属性发生变化时，可以向监听器发送通知;
*  --将多个属性保存在一个map内，而不是保存在多个独立的域内;
* */

class Example {
    var p: String by MyDelegate()
}

class MyDelegate {
    operator fun setValue(thisRef: Any?, property: KProperty<*>, s: String) {
        //To change body of created functions use File | Settings | File Templates.
        println("$thisRef has been assigned to '${property.name} in $thisRef.'")
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        //To change body of created functions use File | Settings | File Templates.
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)

    e.p = "NEW"
}

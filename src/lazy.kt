/*默认情况下，延迟加载属性(lazy property)的计算是同步的(synchronized)：
* 属性值只会在唯一一个线程内计算，然后所有线程都将得到同样的属性值。
* 如果委托的初始化计算不需要同步，多个线程可以同时执行初始化计算，那么可以向lazy()函数
* 传入一个LazyThreadSafetyMode.PUBLICATION 参数. 相反, 如果你确信初期化计算只可能
* 发生在一个线程内, 那么可以使用 LazyThreadSafetyMode.NONE 模式, 这种模式不会保持线程同步,
* 因此不会带来这方面的性能损失.
* */
class myLazy {
    val lazyValue: String by lazy {
        println("computed")
        "Hello"
    }
}

fun main(args: Array<String>) {
    val l = myLazy()
    println(l.lazyValue)

    println(l.lazyValue)
}

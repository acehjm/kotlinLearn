/*
* 要符合 tailrec 修饰符的要求, 函数必须在它执行的所有操作的最后一步, 递归调用它自身.
* 如果在这个递归调用之后还存在其他代码, 那么你不能使用尾递归, 而且你不能将尾递归用在 try/catch/finally 结构内.
* 尾递归目前只能用在 JVM 环境内.
* */

/*余弦函数的不动点(fixpoint)*/
tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

fun main(args: Array<String>) {
    println(findFixPoint(2.0))
}


import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) {
    //sampleStart
    val seq = buildSequence {
        for (i in 1..5) {
            //产生一个 i 的平方
            yield(i * i)
        }
        //产生一个区间
        yieldAll(26..30)
    }

    //输出该序列
    println(seq.toList())
    //sampleEnd
}
import java.util.*

class Data {
    var value = 0
}

class Work {
    fun process(data: Data, vararg numbers: Int) {
        numbers.forEach { data.value += it }
    }
}

class Thread1() : Thread() {
    private lateinit var work: Work

    constructor(work: Work) : this() {
        this.work = work
    }

    override fun run() {
        val data = Data()
        val random = Random()
        val n1 = random.nextInt(1000)
        val n2 = random.nextInt(2000)
        val n3 = random.nextInt(3000)

        work.process(data, n1, n2, n3)

        println("$n1 + $n2 + $n3 = ${data.value}")
    }
}

fun main(args: Array<String>) {
    val thread1 = Thread1(Work())
    thread1.start()
}
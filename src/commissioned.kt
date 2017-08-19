import java.util.*

fun needAnswer() = Random().nextBoolean()

fun main(args: Array<String>) {
    val answer by lazy {
        println("calculating the answer...")
        12
    }
    if (needAnswer())
        println("The answer is $answer.")
    else
        println("Sometimes no answer is the answer.")
}
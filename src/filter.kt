/**
 * Description
 *
 * @author dyoon
 * @date 2017-03-22 16:22
 */
class filter

fun main(args: Array<String>) {
    val a = mutableListOf("a", "b", "c")
    val b = mutableListOf("c", "d", "e")

    a.filter { !b.contains(it) }.forEach(::println)
}
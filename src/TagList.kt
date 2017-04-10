import java.io.Serializable
import java.util.*

class TagList : LinkedList<Double>()

fun <T> Iterable<T>.asTagList(): TagList = TagList()

fun mutableTagListOf(): TagList = TagList()


fun main(args: Array<String>) {
    val tagList = mutableTagListOf()
    repeat(5) { tagList.add(Math.random()) }
    tagList.forEach(::println)

    println("---------------------------")

    val list = mutableListOf<Double>()
    repeat(5) { list.add(Math.random()) }
    tagList.forEach(::println)

    println("+++++++++++++++++++++++++++")
    val tags: TagList = list.asTagList()
    tags.forEach(::println)

    //-----------------------------------

    println("+++++++++++++++++++++++++++")
    val childs = CustomList()
    childs.add(1)
    childs.add(2)
    val tagMaps = mutableMapOf(1 to 4, 2 to 5, 3 to 7)

    println("$tagMaps ${tagMaps[1]} ${tagMaps[1] is Int}")
    val tagss: CustomList = childs.mapTo(CustomList()) { tagMaps[it] as Int }
    println(tagss)

    println("$$$$$$$$$$$$$$$$$$$$$$$$$")
    val ts = res(TagList())
    println(ts)
}

fun res(tags: TagList): TagList {
    tags.add(Math.random())
    while (tags.size < 5) {
        res(tags)
    }
    return tags
}

class CustomList: LinkedList<Int>(), Serializable
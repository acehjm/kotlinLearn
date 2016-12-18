import java.util.*

class field {
    private var _table: Map<String, Int>? = mapOf("one" to 1, "two" to 2, "three" to 3)

    public val table: Map<String, Int>
        get() {
            if (_table == null)
                _table = HashMap()
            return _table ?: throw AssertionError("Set to null by an other thread")
        }
}

fun main(args: Array<String>) {
    println(field().table)

    println(double(4))
}


fun double(x:Int) = x *2
import java.util.*

private var ARRAY_COUNT = 1000
/*
 * 获取随机数列
 */
private fun getSortList(): IntArray {
    val sortList = IntArray(ARRAY_COUNT)
    val ra = Random()
    for (i in sortList.indices) {
        sortList[i] = ra.nextInt(ARRAY_COUNT * 10)
    }
    return sortList
}

/*
 * 交换数列元素
 */
private fun swapByIndex(list: IntArray, x: Int, y: Int) {
    val temp = list[x]
    list[x] = list[y]
    list[y] = temp
}

/*
快速排序的循环
 */
fun qsort(x: IntArray, l: Int, u: Int) {
    if (l >= u) return
    val t = x[l]
    var i = l
    var j = u + 1
    while (i < j) {
        //比较左右两边的值，让其小于参考值的放在列表左边，大于参考值的放在列表右边
        do {
            i++
        } while (i <= u && x[i] < t)
        do {
            j--
        } while (x[j] > t)
        if (i > j) break
        //此时遇到了 list[left]>mid>list[right]，需要交换两侧
        swapByIndex(x, i, j)
    }
    swapByIndex(x, l, j)

    //递归拆分列表
    qsort(x, l, j - 1)
    qsort(x, j + 1, u)
}

fun main(args: Array<String>) {
    val sortList = getSortList()
    println("before sort array: ${sortList.toList()}")

    val start = System.currentTimeMillis()
    qsort(sortList, 0, sortList.size - 1)
    val end = System.currentTimeMillis()
    println("count time: ${end - start}")
    println("after sort array: ${sortList.toList()}")
}
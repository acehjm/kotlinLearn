fun main(args: Array<String>) {

    for (i in 1.rangeTo(9)) {
        print(i)
    }
    println("\n--------------")

    for (i in 1..9) {
        print(i)
    }
    println("\n-------------")

    for (i in 5..1) {
        print(i)
    }
    println("-------------")

    for (i in 9 downTo 1 step 2) {
        print(i)
    }
}
/*
* 枚举类：列出所有的 action state
* */
enum class TStates(var state: Int) {
    UnAssigned(1001), Pending(1002), Failed(1003), Started(1004), Skipped(1005), Completed(1006), Aborted(1007), Suspended(1008)
}

/*
* action type
* */
enum class TActions(var action: Int) {
    Assign(9000), Start(9001), Perform(9002), Complete(9003), Skip(9004), Suspend(9005),
    Resume(9006), Abort(9007), Undo(9008), Fail(9009)
}


fun main(args: Array<String>) {
    println("states: ${TStates.Pending}")
    println("states int: ${TStates.Pending.state}")
    println("states name: ${TStates.Pending.name}")

    print("by name: ${TStates.valueOf("Pending")}")
}
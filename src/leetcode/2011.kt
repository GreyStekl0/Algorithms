package leetcode

fun finalValueAfterOperations(operations: Array<String>): Int {
    var x = 0
    for (i in operations) {
        if (i == "X++" || i == "++X") {
            x++
        } else {
            x--
        }
    }
    return x
}

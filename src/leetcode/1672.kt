package leetcode

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    for (i in accounts) {
        if (i.sum() > max) max = i.sum()
    }
    return max
}

fun main() {
    val accounts = arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5))
    println(maximumWealth(accounts))
}

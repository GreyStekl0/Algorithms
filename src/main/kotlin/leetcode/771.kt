package leetcode

fun numJewelsInStones(
    jewels: String,
    stones: String,
): Int {
    var count = 0
    for (i in stones) {
        if (i in jewels) count++
    }
    return count
}

fun main() {
    println(numJewelsInStones("aA", "aAAbbbb"))
}

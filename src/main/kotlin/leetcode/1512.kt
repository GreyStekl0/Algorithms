package leetcode

fun numIdenticalPairs(nums: IntArray): Int {
    var result = 0
    for (i in nums.indices) {
        for (j in i + 1..nums.size - 1) {
            if (nums[i] == nums[j]) result++
        }
    }
    return result
}

fun main() {
    val nums = intArrayOf(1, 1, 1, 1)
    println(numIdenticalPairs(nums))
}

package leetcode

fun buildArray(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    for (i in nums.indices) {
        result[i] = nums[nums[i]]
    }
    return result
}

fun main() {
    val nums = intArrayOf(0, 2, 1, 5, 3, 4)
    println(buildArray(nums).joinToString(", "))
}

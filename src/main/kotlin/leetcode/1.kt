package leetcode

fun twoSum(
    nums: IntArray,
    target: Int,
): IntArray {
    val result = IntArray(2)
    outer@ for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                result[0] = i
                result[1] = j
                break@outer
            }
        }
    }
    return result
}

fun main() {
    val nums = intArrayOf(3, 2, 4)
    val target = 6
    println(twoSum(nums, target).joinToString(", "))
}

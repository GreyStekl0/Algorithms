package leetcode

fun containsDuplicate(nums: IntArray): Boolean {
    nums.sort()

    for (i in 0 until (nums.size - 1)) {
        if (nums[i] == nums[i + 1]) {
            return true
        }
    }
    return false
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4)
    println(containsDuplicate(array))
}

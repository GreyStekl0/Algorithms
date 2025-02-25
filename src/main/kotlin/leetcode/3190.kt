package leetcode

fun minimumOperations(nums: IntArray): Int = nums.count { it % 3 != 0 }

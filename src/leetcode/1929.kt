package leetcode

fun getConcatenation(nums: IntArray): IntArray = IntArray(nums.size * 2) { nums[it % nums.size] }

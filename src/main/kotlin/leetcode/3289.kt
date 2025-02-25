package leetcode

fun getSneakyNumbers(nums: IntArray): IntArray =
    nums
        .groupBy { it }
        .filter { it.value.size > 1 }
        .keys
        .toIntArray()

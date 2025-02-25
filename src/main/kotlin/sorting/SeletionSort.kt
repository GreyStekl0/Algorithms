package sorting

import kotlin.collections.joinToString

fun findSmallest(nums: IntArray): Int {
    var min = nums[0]
    var minIndex = 0
    for (i in 1 until nums.size) {
        if (min > nums[i]) {
            min = nums[i]
            minIndex = i
        }
    }
    return minIndex
}

fun selectionSort(nums: IntArray): IntArray {
    val sortedNums = IntArray(nums.size)
    val copiedNums = nums.copyOf()
    for (i in nums.indices) {
        val minIndex = findSmallest(copiedNums)
        sortedNums[i] = copiedNums[minIndex]
        copiedNums[minIndex] = Int.MAX_VALUE
    }
    return sortedNums
}

fun main() {
    val nums = intArrayOf(9, 3, 5, 2, 7)
    println(selectionSort(nums).joinToString(", "))
}

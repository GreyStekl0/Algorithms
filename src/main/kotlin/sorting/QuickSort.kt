package sorting

fun quickSort(nums: IntArray): IntArray {
    if (nums.size < 2) return nums
    val pivot = nums[nums.size / 2]
    val less = nums.filter { it < pivot }.toIntArray()
    val greater = nums.filter { it > pivot }.toIntArray()
    return quickSort(less) + pivot + quickSort(greater)
}

fun main() {
    val nums = intArrayOf(9, 3, 5, 2, 7)
    println(quickSort(nums).joinToString(", "))
}

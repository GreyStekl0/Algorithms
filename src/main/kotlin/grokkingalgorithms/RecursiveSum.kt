package grokkingalgorithms

fun recursiveSum(nums: IntArray): Int =
    if (nums.isEmpty()) {
        0
    } else {
        nums[0] + recursiveSum(nums.copyOfRange(1, nums.size))
    }

fun main() {
    val nums = intArrayOf(2, 4, 6)
    println(recursiveSum(nums))
}

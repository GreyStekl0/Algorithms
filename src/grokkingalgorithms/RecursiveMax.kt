package grokkingalgorithms

fun recursiveMax(nums: IntArray): Int {
    when (nums.size) {
        2 -> return if (nums[0] > nums[1]) nums[0] else nums[1]
        else -> {
            val max = recursiveMax(nums.copyOfRange(1, nums.size))
            return if (nums[0] > max) nums[0] else max
        }
    }
}

fun main() {
    val nums = intArrayOf(2, 4, 6, 1, 3)
    println(recursiveMax(nums))
}

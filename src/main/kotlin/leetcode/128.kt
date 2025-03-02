package leetcode

fun longestConsecutive(nums: IntArray): Int {
    val numSet = nums.toHashSet()
    var longestStreak = 0

    for (num in numSet) {
        if (!numSet.contains(num - 1)) {
            var currentNum = num
            var currentStreak = 1

            while (numSet.contains(currentNum + 1)) {
                currentNum++
                currentStreak++
            }

            longestStreak = maxOf(longestStreak, currentStreak)
        }
    }

    return longestStreak
}

fun main() {
    val nums = intArrayOf(100, 4, 200, 1, 2, 3)
    println(longestConsecutive(nums))
}

package leetcode

fun shuffle(
    nums: IntArray,
    n: Int,
): IntArray {
//    val shuffle = IntArray(nums.size)
//    var index = 0
//    for (i in 0 until nums.size - n){
//        shuffle[index] = nums[i]
//        shuffle[index+1] = nums[i+n]
//        index+=2
//    }
//    return shuffle

    return IntArray(nums.size) { i ->
        if (i % 2 == 0) nums[i / 2] else nums[n + i / 2]
    }
}

fun main() {
    val nums = intArrayOf(2, 5, 1, 3, 4, 7)
    val n = 3
    println(shuffle(nums, n).joinToString(", "))
}

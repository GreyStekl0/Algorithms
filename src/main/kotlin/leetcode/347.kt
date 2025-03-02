package leetcode

fun topKFrequent(
    nums: IntArray,
    k: Int,
): IntArray {
    val result = IntArray(k)
    val countMap = mutableMapOf<Int, Int>()
    for (num in nums) {
        if (countMap.containsKey(num)) {
            countMap[num] = countMap[num]!! + 1
        } else {
            countMap[num] = 1
        }
    }
    for (i in 0 until k) {
        val maxEntry = countMap.maxByOrNull { it.value }!!.key
        result[i] = maxEntry
        countMap.remove(maxEntry)
    }
    return result
}

fun main() {
    println(topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2).joinToString())
}

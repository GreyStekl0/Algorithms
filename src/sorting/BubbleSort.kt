package sorting

fun bubbleSort(nums: IntArray): IntArray {
    val sorted = nums.copyOf()
    var temp = 0
    for (j in sorted.size - 1 downTo 1) {
        for (i in 0 until j) {
            if (sorted[i] > sorted[i + 1]) {
                temp = sorted[i]
                sorted[i] = sorted[i + 1]
                sorted[i + 1] = temp
            }
        }
    }
    return sorted
}

fun main() {
    val nums = intArrayOf(7, 3, 9, 5, 2)
    println(bubbleSort(nums).joinToString(", "))
}

package search

fun binarySearch(
    nums: IntArray,
    item: Int,
): Int? {
    var min = 0
    var max = nums.size - 1
    while (min <= max) {
        var mid = min + (max - min) / 2
        var guess = nums[mid]
        if (guess == item) {
            return mid
        } else if (guess > item) {
            max = mid - 1
        } else {
            min = mid + 1
        }
    }
    return null
}

fun main() {
    val array = IntArray(100) { it * 3 }
    println(array.size)
    println(binarySearch(array, 297))
}

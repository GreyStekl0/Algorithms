package leetcode

import kotlin.math.abs

// fun minOperations(boxes: String): IntArray {
//    var answer = IntArray(boxes.length)
//    for (i in 0 until boxes.length) {
//        var count = 0
//        for (j in 0 until boxes.length) {
//            if (i != j && boxes[j] == '1') {
//                count += abs(i - j)
//            }
//        }
//        answer[i] = count
//    }
//    return answer
// }

fun minOperations(boxes: String): IntArray {
    val ballIndexes = ArrayList<Int>()
    val length = boxes.length
    for (index in 0 until length) {
        if (boxes[index] == '1') {
            ballIndexes.add(index)
        }
    }

    val result = IntArray(length)
    for (index in boxes.indices) {
        var count = 0
        for (ballIndex in ballIndexes) {
            count += abs(ballIndex - index)
        }
        result[index] = count
    }

    return result
}

fun main() {
    val boxes = "110"
    println(minOperations(boxes).joinToString(", ")) // 1,1,3
}

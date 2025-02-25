package leetcode

import kotlin.math.abs

fun scoreOfString(s: String): Int {
    var x = 0
    for (i in 0 until s.length - 1) {
        x += abs(s[i] - s[i + 1])
    }
    return x
}

fun main() {
    println(scoreOfString("hello"))
}

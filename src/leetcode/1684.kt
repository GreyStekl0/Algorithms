package leetcode

fun countConsistentStrings(
    allowed: String,
    words: Array<String>,
): Int {
    var count = 0
    for (i in words) {
    }
    return count
}

fun main() {
    val allowed = "ab"
    val words = arrayOf("ad", "bd", "aaab", "baa", "badab")
    println(allowed[0] in words[0])
    println(countConsistentStrings(allowed, words))
}

package leetcode

fun findWordsContaining(
    words: Array<String>,
    x: Char,
): List<Int> {
    val result = mutableListOf<Int>()
    for (i in words.indices) {
        if (x in words[i]) result.add(i)
    }
    return result
}

fun main() {
    val x = 'e'
    val words = arrayOf("leet", "code")
    println(findWordsContaining(words, x))
}

package leetcode

fun isAnagram(
    s: String,
    t: String,
): Boolean {
    val countMap = IntArray(26)
    for (i in s) countMap[i - 'a']++
    for (j in t) countMap[j - 'a']--
    return countMap.all { it == 0 }
}

fun main() {
    val s = "anagram"
    val t = "nagaram"
    println(isAnagram(s, t))
}

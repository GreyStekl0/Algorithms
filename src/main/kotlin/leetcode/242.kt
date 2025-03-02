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

fun isAnagram2(
    s: String,
    t: String,
): Boolean {
    val sortS = s.toCharArray().apply { sort() }
    val sortT = t.toCharArray().apply { sort() }
    return (sortS.contentEquals(sortT))
}

fun main() {
    val s = "anagram"
    val t = "nagaram"
    println(isAnagram(s, t))
}

package leetcode

fun isAnagram(
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

package leetcode

fun convertDateToBinary(date: String): String {
    val subdate = date.split("-")
    var result = ""
    for (i in subdate) result += i.toInt().toString(2) + "-"
    return result.substring(0, result.length - 1)
}

fun main() {
    val date = "2080-02-29"
    println(convertDateToBinary(date))
}

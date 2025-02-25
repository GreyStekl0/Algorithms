package leetcode

fun defangIPaddr(address: String): String = address.replace(".", "[.]")

fun main() {
    println(defangIPaddr("1.1.1.1"))
}

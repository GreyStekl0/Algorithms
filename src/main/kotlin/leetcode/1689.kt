package leetcode

fun minPartitions(n: String): Int = n.maxOf { it - '0' }

fun main() {
    println(minPartitions("32"))
}

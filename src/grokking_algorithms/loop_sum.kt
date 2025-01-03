package grokking_algorithms

fun sum(nums: IntArray): Int{
    var total = 0
    for (i in nums) total+=i
    return total
}

fun main(){
    val nums = intArrayOf(2,4,6)
    println(sum(nums))
}
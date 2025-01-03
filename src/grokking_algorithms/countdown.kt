package grokking_algorithms

fun countdown(i: Int) {
    println(i)
    if (i<=1) return
    else countdown(i-1)
}

fun main(){
    countdown(3)
}
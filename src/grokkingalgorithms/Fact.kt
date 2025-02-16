package grokkingalgorithms

fun fact(x: Int): Int =
    if (x == 1) {
        1
    } else {
        x * fact(x - 1)
    }

fun main() {
    println(fact(5))
}

package grokkingalgorithms

fun gcd(
    a: Int,
    b: Int,
): Int {
    var num1 = a
    var num2 = b
    while (num1 != 0 && num2 != 0) {
        if (num1 > num2) {
            num1 = num1 % num2
        } else {
            num2 = num2 % num1
        }
    }
    return num1 + num2
}

fun main() {
    println(gcd(12, 18))
}

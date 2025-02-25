package leetcode

fun gcd(
    a: Int,
    b: Int,
): ListNode {
    var num1 = a
    var num2 = b
    while (num1 != 0 && num2 != 0) {
        if (num1 > num2) {
            num1 = num1 % num2
        } else {
            num2 = num2 % num1
        }
    }
    return ListNode(num1 + num2)
}

fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
    var result = head
    while (result?.next != null) {
        val current = result.next
        val temp = gcd(result.`val`, result.next!!.`val`)
        temp.next = result.next
        result.next = temp
        result = current
    }
    return head
}

fun main() {
    val head = ListNode(18)
    head.next = ListNode(6)
    insertGreatestCommonDivisors(head)
}

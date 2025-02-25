package leetcode

fun mergeNodes(head: ListNode?): ListNode? {
    var current = head!!.next
    var sum = 0
    while (current?.next != null) {
        var start = current
        while (current?.`val` != 0) {
            sum += current!!.`val`
            current = current.next
        }
        start.`val` = sum
        start.next = current.next
        current = current.next
        sum = 0
    }
    return head.next
}

fun main() {
    val head = ListNode(0)
    head.next = ListNode(3)
    head.next!!.next = ListNode(3)
    head.next!!.next!!.next = ListNode(0)
    head.next!!
        .next!!
        .next!!
        .next = ListNode(5)
    mergeNodes(head)?.printList()
}

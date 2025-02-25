package leetcode

class ListNode(
    var `val`: Int,
) {
    var next: ListNode? = null

    fun printList() {
        var current: ListNode? = this
        while (current != null) {
            print("${current.`val`} ")
            current = current.next
        }
        println()
    }
}

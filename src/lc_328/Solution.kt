package lc_328

class Solution {
    fun oddEvenList(head: ListNode?): ListNode? {
        head ?: return null

        val oddEven = ListNode(head.`val`)
        var oddEvenNext: ListNode? = oddEven

        var next = head.next?.next
        while (next != null) {
            oddEvenNext?.next = ListNode(next.`val`)
            oddEvenNext = oddEvenNext?.next
            next = next.next?.next
        }

        next = head.next
        while (next != null) {
            oddEvenNext?.next = ListNode(next.`val`)
            oddEvenNext = oddEvenNext?.next
            next = next.next?.next
        }

        return oddEven
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

package lc_2095

class Solution {
    fun deleteMiddle(head: ListNode?): ListNode? {
        head?.next ?: return null

        var prev: ListNode? = null
        var slow = head
        var fast = head
        while (fast?.next != null) {
            prev = slow
            slow = slow?.next
            fast = fast.next?.next
        }
        prev?.next = slow?.next

        return head
    }
}

class ListNode {
    var next: ListNode? = null
}

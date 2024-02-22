package lc_2130

class Solution {
    fun pairSum(head: ListNode?): Int {
        var next = head
        var tail = head
        do {
            next = next?.next
            next?.`val`?.let {
                val newTail = ListNode(it)
                newTail.next = tail
                tail = newTail
            }
        } while (next != null)

        var left = head
        var right = tail
        var maxSum = 0
        while (left != null && right != null) {
            val sum = left.`val` + right.`val`
            if (maxSum < sum) maxSum = sum

            left = left.next
            right = right.next
        }

        return maxSum
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

package lc_21

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var l1 = list1
        var l2 = list2
        val merged: ListNode?
        when {
            l1 == null && l2 == null -> return null
            l1 == null -> return l2
            l2 == null -> return l1

            l1.`val` < l2.`val` -> {
                merged = l1
                l1 = l1.next
            }

            else -> {
                merged = l2
                l2 = l2.next
            }
        }
        merged.next = merge(l1, l2)

        return merged
    }

    private fun merge(l1: ListNode?, l2: ListNode?): ListNode? = when {
        l1 == null -> l2
        l2 == null -> l1

        l1.`val` < l2.`val` -> {
            l1.next = merge(l1.next, l2)
            l1
        }

        else -> {
            l2.next = merge(l1, l2.next)
            l2
        }
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

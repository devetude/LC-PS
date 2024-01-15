package lc_496

import java.util.Stack

class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val num2Idx = HashMap<Int, Int>()
        nums2.forEachIndexed { i, num -> num2Idx[num] = i }

        val stack = Stack<Int>()
        val nge = IntArray(nums2.size) { -1 }
        for (i in nums2.lastIndex downTo 0) {
            while (stack.isNotEmpty() && stack.peek() < nums2[i]) stack.pop()
            if (stack.isNotEmpty()) nge[i] = stack.peek()
            stack.push(nums2[i])
        }

        val result = IntArray(nums1.size)
        for (i in nums1.indices) result[i] = nge[num2Idx[nums1[i]]!!]

        return result
    }
}

package lc_503

import java.util.Stack

class Solution {
    fun nextGreaterElements(nums: IntArray): IntArray {
        val answer = IntArray(nums.size) { -1 }
        val stack = Stack<Pair<Int, Int>>()
        repeat(times = 2) {
            nums.forEachIndexed { i, num ->
                while (stack.isNotEmpty() && stack.peek().second < num) {
                    answer[stack.pop().first] = num
                }
                stack.push(i to num)
            }
        }

        return answer
    }
}

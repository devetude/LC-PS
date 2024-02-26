package lc_739

import java.util.Stack

class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val answer = IntArray(temperatures.size)
        val stack = Stack<Int>()
        for (i in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                val j = stack.pop()
                answer[j] = i - j
            }
            stack.push(i)
        }

        return answer
    }
}

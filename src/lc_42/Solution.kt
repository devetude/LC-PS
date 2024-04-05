package lc_42

import java.util.Stack

class Solution {
    fun trap(height: IntArray): Int {
        var maxHeight = 0
        val stack = Stack<Pair<Int, Int>>()
        height.forEach {
            stack.push(it to maxHeight)
            maxHeight = maxOf(maxHeight, it)
        }

        maxHeight = 0
        var water = 0
        while (stack.isNotEmpty()) {
            val pair = stack.pop()
            water += (minOf(pair.second, maxHeight) - pair.first).coerceAtLeast(minimumValue = 0)
            maxHeight = maxOf(maxHeight, pair.first)
        }

        return water
    }
}

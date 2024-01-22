package lc_2390

import java.util.Stack

class Solution {
    fun removeStars(s: String): String {
        val stack = Stack<Char>()
        s.forEach {
            if (it == '*') {
                while (stack.isNotEmpty()) if (stack.pop() != '*') break
            } else {
                stack.push(it)
            }
        }

        return stack.joinToString(separator = "")
    }
}

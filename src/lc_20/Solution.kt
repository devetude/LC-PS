package lc_20

import java.util.Stack

class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        s.forEach {
            when (it) {
                ')' ->
                    if (stack.isNotEmpty() && stack.peek() == '(') stack.pop() else stack.push(it)

                ']' ->
                    if (stack.isNotEmpty() && stack.peek() == '[') stack.pop() else stack.push(it)

                '}' ->
                    if (stack.isNotEmpty() && stack.peek() == '{') stack.pop() else stack.push(it)

                else -> stack.push(it)
            }
        }

        return stack.isEmpty()
    }
}

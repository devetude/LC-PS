package lc_394

import java.util.Stack

class Solution {
    fun decodeString(s: String): String {
        val countStack = Stack<Int>()
        val strStack = Stack<String>()
        val countSb = StringBuilder()
        for (c in s) {
            if (c in '0'..'9') {
                countSb.append(c - '0')
                continue
            }

            if (countSb.isNotEmpty()) {
                countStack.push(countSb.toString().toInt())
                countSb.clear()
            }

            if (c != ']') {
                strStack.push(c.toString())
                continue
            }

            val strSb = StringBuilder()
            var peek: String
            while (strStack.pop().also { peek = it } != "[") strSb.append(peek.reversed())
            repeat(countStack.pop()) { strStack.push(strSb.toString().reversed()) }
        }

        return strStack.joinToString(separator = "")
    }
}

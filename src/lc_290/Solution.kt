package lc_290

import java.util.StringTokenizer

class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val st = StringTokenizer(s)
        val isUsed = BooleanArray(size = 26)
        val patternCharOf = hashMapOf<String, Char>()
        var i = 0
        while (st.hasMoreTokens()) {
            val word = st.nextToken()
            val patternChar = patternCharOf[word]
            if (patternChar == null) {
                val j = pattern[i] - 'a'
                if (isUsed[j]) return false

                patternCharOf[word] = pattern[i]
                isUsed[j] = true
            } else if (pattern.lastIndex < i || patternChar != pattern[i]) {
                return false
            }
            ++i
        }

        return i == pattern.length
    }
}

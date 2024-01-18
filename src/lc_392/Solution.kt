package lc_392

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        for (c in t) {
            if (s.lastIndex < i) break
            if (c == s[i]) ++i
        }

        return i == s.length
    }
}

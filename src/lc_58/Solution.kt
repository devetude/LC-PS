package lc_58

class Solution {
    fun lengthOfLastWord(s: String): Int {
        var len = 0
        for (i in s.indices.reversed()) if (s[i] != ' ') ++len else if (0 < len) break

        return len
    }
}

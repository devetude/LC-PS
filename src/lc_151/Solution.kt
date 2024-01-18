package lc_151

class Solution {
    fun reverseWords(s: String): String {
        val words = s.trim().split("\\s+".toRegex()).toMutableList()
        var i = 0
        var j = words.lastIndex
        while (i < j) {
            val tmp = words[i]
            words[i++] = words[j]
            words[j--] = tmp
        }

        return words.joinToString(separator = " ")
    }
}

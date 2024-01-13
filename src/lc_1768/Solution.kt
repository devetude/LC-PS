package lc_1768

class Solution {
    fun mergeAlternately(word1: String, word2: String): String = buildString {
        var i = 0
        var j = 0
        val mergedLength = word1.length + word2.length
        while (i + j <= mergedLength - 1) {
            if (i < word1.length) append(word1[i++])
            if (j < word2.length) append(word2[j++])
        }
    }
}

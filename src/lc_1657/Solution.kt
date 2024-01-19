package lc_1657

class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) return false

        val word1CharToCount = word1.groupBy { it }.mapValues { it.value.size }
        val word2CharToCount = word2.groupBy { it }.mapValues { it.value.size }
        if (word1CharToCount.keys != word2CharToCount.keys) return false

        val word1CountToCount = word1CharToCount.values.groupBy { it }.mapValues { it.value.size }
        val word2CountToCount = word2CharToCount.values.groupBy { it }.mapValues { it.value.size }
        return word1CountToCount == word2CountToCount
    }
}

package lc_383

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val countOf = IntArray(size = 26)
        magazine.forEach { ++countOf[it - 'a'] }
        ransomNote.forEach {
            val i = it - 'a'
            if (countOf[i] < 1) return false else --countOf[i]
        }

        return true
    }
}

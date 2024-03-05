package lc_242

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val frequencyOf = IntArray(size = 26)
        s.forEachIndexed { i, c ->
            ++frequencyOf[c - 'a']
            --frequencyOf[t[i] - 'a']
        }

        return frequencyOf.all { it == 0 }
    }
}

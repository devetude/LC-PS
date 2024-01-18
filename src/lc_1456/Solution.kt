package lc_1456

class Solution {
    fun maxVowels(s: String, k: Int): Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        var count = 0
        repeat(k) { if (s[it] in vowels) ++count }
        var maxCount = count
        for (i in k..<s.length) {
            if (s[i] in vowels) ++count
            if (s[i - k] in vowels) --count
            if (maxCount < count) maxCount = count
        }

        return maxCount
    }
}

package lc_13

class Solution {
    fun romanToInt(s: String): Int {
        var sum = 0
        for (i in s.lastIndex downTo 0) {
            val j = i + 1
            sum += when (s[i]) {
                'I' -> if (j < s.length && (s[j] == 'V' || s[j] == 'X')) -1 else 1
                'V' -> 5
                'X' -> if (j < s.length && (s[j] == 'L' || s[j] == 'C')) -10 else 10
                'L' -> 50
                'C' -> if (j < s.length && (s[j] == 'D' || s[j] == 'M')) -100 else 100
                'D' -> 500
                else -> 1_000
            }
        }

        return sum
    }
}

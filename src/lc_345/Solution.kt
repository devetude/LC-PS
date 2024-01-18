package lc_345

class Solution {
    fun reverseVowels(s: String): String {
        val vowels = setOf('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U')
        var i = 0
        var j = s.lastIndex
        val chars = CharArray(s.length)
        mainLoop@ while (i <= j) {
            while (i <= s.lastIndex && s[i] !in vowels) {
                if (j < i) break@mainLoop
                chars[i] = s[i++]
            }
            while (0 <= j && s[j] !in vowels) {
                if (j < i) break@mainLoop
                chars[j] = s[j--]
            }
            chars[i] = s[j]
            chars[j--] = s[i++]
        }

        return String(chars)
    }
}

fun main() {
    print(Solution().reverseVowels("ai"))
}

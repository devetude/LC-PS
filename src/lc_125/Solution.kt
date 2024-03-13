package lc_125

class Solution {
    fun isPalindrome(s: String): Boolean {
        val alphanumeric = buildString {
            s.forEach {
                when (it) {
                    in 'a'..'z', in '0'..'9' -> append(it)
                    in 'A'..'Z' -> append(it + ('a' - 'A'))
                    else -> return@forEach
                }
            }
        }

        var left = 0
        var right = alphanumeric.lastIndex
        while (left < right) {
            if (alphanumeric[left++] != alphanumeric[right--]) return false
        }

        return true
    }
}

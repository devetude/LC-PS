package lc_1071

class Solution {
    fun gcdOfStrings(str1: String, str2: String): String =
        str1.substring(startIndex = 0, endIndex = gcd(str1.length, str2.length))
            .takeIf { str1 + str2 == str2 + str1 }
            .orEmpty()

    private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, b = a % b)
}

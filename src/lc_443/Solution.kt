package lc_443

class Solution {
    fun compress(chars: CharArray): Int {
        val result = buildString {
            var count = 0
            for (i in chars.indices) {
                ++count
                if (i == chars.lastIndex || chars[i] != chars[i + 1]) {
                    append(chars[i])
                    if (1 < count) append(count)
                    count = 0
                }
            }
        }
        for (i in result.indices) chars[i] = result[i]

        return result.length
    }
}

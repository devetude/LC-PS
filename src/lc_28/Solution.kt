package lc_28

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var i = 0
        while (i in haystack.indices) {
            if (haystack[i] != needle.first()) {
                ++i
                continue
            }

            val range = i until i + needle.length
            if (haystack.lastIndex < range.last) return -1

            var j = range.first
            var k = i
            var isMatched = true
            while (j in range) {
                if (haystack[j] == needle.first() && k == i) k = j
                if (haystack[j] != needle[j - i]) {
                    isMatched = false
                    break
                }
                ++j
            }
            if (isMatched) {
                return i
            } else {
                i = if (i < k) k else j + 1
            }
        }

        return -1
    }
}

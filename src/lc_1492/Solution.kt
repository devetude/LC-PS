package lc_1492

class Solution {
    fun kthFactor(n: Int, k: Int): Int {
        var j = 0
        for (i in 1..n) if (n % i == 0 && ++j == k) return i

        return -1
    }
}

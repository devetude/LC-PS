package lc_1137

class Solution {
    fun tribonacci(n: Int): Int {
        if (n < 1) return 0
        if (n < 3) return 1

        var first = 0
        var second = 1
        var third = 1
        repeat(times = n - 2) {
            val tmp1 = third
            third += first + second
            val tmp2 = second
            second = tmp1
            first = tmp2
        }

        return third
    }
}

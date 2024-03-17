package lc_70

class Solution {
    fun climbStairs(n: Int): Int {
        var one = 0
        var two = 1
        for (i in 2..n + 1) {
            val tmp = two
            two += one
            one = tmp
        }

        return two
    }
}

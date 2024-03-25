package lc_322

class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        coins.sort()

        val inf = Int.MAX_VALUE shr 1
        val countOf = IntArray(size = amount + 1) { inf }.apply { this[0] = 0 }
        for (i in 1..amount) {
            for (j in coins.indices) {
                val coin = coins[j]
                if (amount < coin) break

                var remainder = i
                var count = 0
                while (coin <= remainder) {
                    remainder -= coin
                    countOf[i] = minOf(countOf[i], b = countOf[remainder] + ++count)
                }
            }
        }

        return if (countOf[amount] == Int.MAX_VALUE) -1 else countOf[amount]
    }
}

package lc_121

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxPrice = prices.last()
        var maxProfit = Int.MIN_VALUE
        for (i in prices.lastIndex - 1 downTo 0) {
            val buyPrice = prices[i]
            maxProfit = maxOf(maxProfit, b = maxPrice - buyPrice)
            maxPrice = maxOf(maxPrice, buyPrice)
        }

        return maxProfit.coerceAtLeast(minimumValue = 0)
    }
}

package lc_122

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var sellPrice = -1
        var profit = 0
        for (i in prices.indices.reversed()) {
            if (prices[i] < sellPrice) profit += sellPrice - prices[i]
            sellPrice = prices[i]
        }

        return profit
    }
}

package lc_1475

import java.util.Stack

class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        val answer = prices.clone()
        val stack = Stack<Pair<Int, Int>>()
        prices.forEachIndexed { i, price ->
            while (stack.isNotEmpty() && price <= stack.peek().second) {
                val (j, prevPrice) = stack.pop()
                answer[j] = prevPrice - price
            }
            stack.push(i to price)
        }

        return answer
    }
}

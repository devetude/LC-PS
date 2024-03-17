package lc_746

class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        for (i in 2 until cost.size) {
            cost[i] += minOf(cost[i - 2], cost[i - 1])
        }

        return minOf(cost[cost.lastIndex - 1], cost[cost.lastIndex])
    }
}

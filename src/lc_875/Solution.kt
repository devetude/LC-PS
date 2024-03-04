package lc_875

class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var min = 1
        var max = piles.max()
        while (min <= max) {
            val mid = min + max shr 1
            val sum = piles.sumOf { it.toLong() / mid + if (it % mid == 0) 0L else 1L }
            if (sum <= h) max = mid - 1 else min = mid + 1
        }

        return min
    }
}

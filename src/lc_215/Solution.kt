package lc_215

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val counts = IntArray(size = 20_001)
        nums.forEach { ++counts[it + 10_000] }

        var i = 0
        for (num in counts.lastIndex downTo 0) {
            if (i + counts[num] < k) {
                i += counts[num]
            } else {
                return num - 10_000
            }
        }

        return Int.MIN_VALUE
    }
}

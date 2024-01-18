package lc_643

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var subSum = 0
        repeat(k) { subSum += nums[it] }
        var maxSubSum = subSum
        for (i in k..<nums.size) {
            subSum += nums[i] - nums[i - k]
            if (maxSubSum < subSum) maxSubSum = subSum
        }

        return maxSubSum.toDouble() / k
    }
}

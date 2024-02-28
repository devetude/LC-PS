package lc_53

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxSum = Int.MIN_VALUE
        var previous = 0
        nums.forEach {
            previous = maxOf(a = previous + it, it)
            maxSum = maxOf(maxSum, previous)
        }

        return maxSum
    }
}

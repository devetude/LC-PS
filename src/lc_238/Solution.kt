package lc_238

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val results = IntArray(nums.size) { 1 }
        val lastIdx = nums.lastIndex
        var forwardMultiple = 1
        var backwardMultiple = 1
        for (i in nums.indices) {
            results[i] *= forwardMultiple
            results[lastIdx - i] *= backwardMultiple
            forwardMultiple *= nums[i]
            backwardMultiple *= nums[lastIdx - i]
        }

        return results
    }
}

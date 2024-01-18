package lc_1004

class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var left = 0
        var flippableCount = k
        for (right in nums.indices) {
            if (nums[right] < 1) --flippableCount
            if (flippableCount < 0) {
                if (nums[left] < 1) ++flippableCount
                ++left
            }
        }

        return nums.size - left
    }
}

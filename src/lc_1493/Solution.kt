package lc_1493

class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var left = 0
        var zeroCount = 0
        nums.forEach {
            if (it < 1) ++zeroCount
            if (1 < zeroCount && nums[left++] < 1) --zeroCount
        }

        return nums.lastIndex - left
    }
}

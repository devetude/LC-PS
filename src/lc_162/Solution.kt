package lc_162

class Solution {
    fun findPeakElement(nums: IntArray): Int {
        var low = 0
        var high = nums.lastIndex
        while (low < high) {
            val mid = low + (low + high shr 1)
            if (nums[mid + 1] < nums[mid]) high = mid else low = mid + 1
        }

        return low
    }
}

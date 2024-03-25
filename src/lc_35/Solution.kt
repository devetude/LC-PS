package lc_35

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size
        while (low < high) {
            val mid = low + high shr 1
            if (nums[mid] < target) low = mid + 1 else high = mid
        }

        return high
    }
}

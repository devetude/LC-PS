package lc_55

class Solution {
    fun canJump(nums: IntArray): Boolean {
        if (nums.size == 1) return true

        var i = nums.lastIndex
        var j = -1
        while (-1 < i) {
            if (nums[i] == 0 && j == -1) {
                j = i
            } else {
                val maxJumpedIndex = i + nums[i]
                if (j < maxJumpedIndex || (j == nums.lastIndex && j == maxJumpedIndex)) j = -1
            }
            --i
        }

        return j == -1
    }
}

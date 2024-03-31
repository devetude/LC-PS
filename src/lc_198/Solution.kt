package lc_198

class Solution {
    fun rob(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]

        val maxMoney = IntArray(nums.size).apply {
            this[0] = nums[0]
            this[1] = maxOf(nums[0], nums[1])
        }
        for (i in 2 until nums.size) {
            maxMoney[i] = maxOf(maxMoney[i - 1], b = maxMoney[i - 2] + nums[i])
        }

        return maxMoney[nums.lastIndex]
    }
}

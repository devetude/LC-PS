package lc_1679

class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        nums.sort()
        var left = 0
        var right = nums.lastIndex
        var count = 0
        while (left < right) {
            val sum = nums[left] + nums[right]
            when {
                sum < k -> ++left
                k < sum -> --right

                else -> {
                    ++count
                    ++left
                    --right
                }
            }
        }

        return count
    }
}

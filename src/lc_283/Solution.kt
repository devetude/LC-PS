package lc_283

class Solution {
    fun moveZeroes(nums: IntArray) {
        var zeroCount = 0
        nums.forEachIndexed { i, num -> if (num == 0) ++zeroCount else nums[i - zeroCount] = num }
        repeat(zeroCount) { nums[nums.lastIndex - it] = 0 }
    }
}

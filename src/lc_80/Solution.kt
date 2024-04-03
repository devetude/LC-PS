package lc_80

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var prev = Int.MIN_VALUE
        var times = 0
        var k = 0
        for (i in nums.indices) {
            if (prev != nums[i]) {
                prev = nums[i]
                times = 1
                nums[k++] = nums[i]
            } else if (++times < 3) {
                nums[k++] = nums[i]
            }
        }

        return k
    }
}

package lc_724

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var acc = 0
        val subSums = IntArray(nums.size) { acc += nums[it]; acc }
        if (acc == subSums[0]) return 0

        for (i in 1 until subSums.size) {
            if (subSums[i - 1] == acc - subSums[i]) return i
        }

        return -1
    }
}

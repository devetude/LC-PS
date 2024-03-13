package lc_1

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        buildMap<Int, Int> {
            nums.forEachIndexed { i, num ->
                this[num]?.let { return intArrayOf(it, i) }
                this[target - num] = i
            }
        }

        return intArrayOf()
    }
}

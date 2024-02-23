package lc_136

class Solution {
    fun singleNumber(nums: IntArray): Int = nums.fold(initial = 0) { acc, num -> acc xor num }
}

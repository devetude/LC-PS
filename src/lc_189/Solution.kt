package lc_189

class Solution {
    fun rotate(nums: IntArray, k: Int) {
        nums.apply {
            val r = k % size
            reverse()
            reverse(r, size)
            reverse(0, r)
        }
    }
}

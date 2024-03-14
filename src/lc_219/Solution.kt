package lc_219

class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        buildMap<Int, Int> {
            nums.forEachIndexed { i, num ->
                this[num]?.let { if (i - it <= k) return true }
                this[num] = i
            }
        }

        return false
    }
}

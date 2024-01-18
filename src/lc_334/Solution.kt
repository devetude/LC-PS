package lc_334

class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
        val smallest = IntArray(size = 2) { Int.MAX_VALUE }
        nums.forEach {
            when {
                it <= smallest[0] -> smallest[0] = it
                it <= smallest[1] -> smallest[1] = it
                else -> return true
            }
        }

        return false
    }
}

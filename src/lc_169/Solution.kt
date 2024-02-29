package lc_169

class Solution {
    fun majorityElement(nums: IntArray): Int {
        var size = 0
        var element = Int.MIN_VALUE
        nums.forEach {
            if (size == 0) {
                element = it
                ++size
                return@forEach
            }

            if (element == it) ++size else --size
        }

        return element
    }
}

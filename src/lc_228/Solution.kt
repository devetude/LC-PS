package lc_228

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) return emptyList()

        val ranges = mutableListOf<String>()

        var start = 0
        for (end in 1 until nums.size) {
            val previous = end - 1
            if (nums[previous] + 1 < nums[end]) {
                val range = if (start == previous) {
                    nums[previous].toString()
                } else {
                    "${nums[start]}->${nums[previous]}"
                }
                ranges.add(range)
                start = end
            }
        }

        val last = nums.lastIndex
        val range = if (start == last) {
            nums[last].toString()
        } else {
            "${nums[start]}->${nums[last]}"
        }
        ranges.add(range)

        return ranges
    }
}

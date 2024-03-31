package lc_167

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.lastIndex
        while (true) {
            val sum = numbers[left] + numbers[right]
            when {
                sum < target -> ++left
                target < sum -> --right
                else -> break
            }
        }

        return intArrayOf(left + 1, right + 1)
    }
}

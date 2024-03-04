package lc_2300

class Solution {
    fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
        potions.sort()

        return IntArray(spells.size) {
            var low = 0
            var high = potions.size
            while (low < high) {
                val mid = low + high shr 1
                val pair = spells[it].toLong() * potions[mid]
                if (pair < success) low = mid + 1 else high = mid
            }
            potions.size - high
        }
    }
}

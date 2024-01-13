package lc_605

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if (n < 1) return true

        var plantedCount = 0
        for (i in flowerbed.indices) {
            if (flowerbed.isUnableToPlant(i)) continue

            flowerbed[i] = 1
            if (n <= ++plantedCount) return true
        }

        return false
    }

    private fun IntArray.isUnableToPlant(i: Int): Boolean {
        val checkStart = (i - 1).coerceAtLeast(minimumValue = 0)
        val checkEnd = (i + 1).coerceAtMost(lastIndex)
        val checkRange = checkStart..checkEnd

        return checkRange.any { this[it] == 1 }
    }
}

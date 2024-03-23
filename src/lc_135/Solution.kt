package lc_135

class Solution {
    fun candy(ratings: IntArray): Int {
        val numberOf = IntArray(ratings.size) { 1 }
        for (i in 1 until ratings.size) {
            if (ratings[i - 1] < ratings[i]) {
                numberOf[i] = numberOf[i - 1] + 1
            }
        }
        for (i in ratings.lastIndex - 1 downTo 0) {
            if (ratings[i + 1] < ratings[i]) {
                numberOf[i] = maxOf(numberOf[i], b = numberOf[i + 1] + 1)
            }
        }

        return numberOf.sum()
    }
}

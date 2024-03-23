package lc_12

class Solution {
    fun intToRoman(num: Int): String {
        val valueOf =
            intArrayOf(1_000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val symbolOf =
            arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

        var remainder = num
        val sb = StringBuilder()
        valueOf.forEachIndexed { i, value ->
            while (value <= remainder) {
                remainder -= value
                sb.append(symbolOf[i])
            }
        }

        return sb.toString()
    }
}

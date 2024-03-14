package lc_202

class Solution {
    fun isHappy(n: Int): Boolean {
        val isVisited = mutableSetOf<String>()
        var str = n.toString()
        while (str !in isVisited) {
            isVisited.add(str)
            val digitSquareSum = str.sumOf {
                val digit = it - '0'
                (digit * digit).toLong()
            }
            if (digitSquareSum == 1L) return true

            str = digitSquareSum.toString()
        }

        return false
    }
}

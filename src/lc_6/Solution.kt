package lc_6

class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s

        val canvas = Array(numRows) { CharArray(size = 1_001) { ' ' } }
        var row = 0
        var col = 0
        var i = 0
        while (i < s.length) {
            while (i < s.length && row < numRows) canvas[row++][col] = s[i++]
            row -= 2
            ++col
            while (i < s.length && 0 < row) canvas[row--][col++] = s[i++]
        }

        val sb = StringBuilder()
        for (row in 0 until numRows) {
            for (col in 0 until 1_001) {
                if (canvas[row][col] != ' ') sb.append(canvas[row][col])
            }
        }

        return sb.toString()
    }
}

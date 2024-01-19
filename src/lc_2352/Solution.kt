package lc_2352

class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        var count = 0
        for (rowIdx in grid.indices) {
            val col = IntArray(grid.size) { grid[it][rowIdx] }
            grid.forEach { if (it contentEquals col) ++count }
        }

        return count
    }
}

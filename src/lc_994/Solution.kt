package lc_994

import java.util.LinkedList

class Solution {
    private val dirs: Sequence<Pair<Int, Int>> =
        sequenceOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

    fun orangesRotting(grid: Array<IntArray>): Int {
        val coords = LinkedList<Triple<Int, Int, Int>>()
        for (row in grid.indices) {
            for (col in grid[row].indices) {
                if (grid[row][col] == 2) {
                    grid[row][col] = 0
                    coords.offer(Triple(row, col, third = 0))
                }
            }
        }

        var maxDay = 0
        while (coords.isNotEmpty()) {
            val (row, col, day) = coords.poll()
            maxDay = maxOf(maxDay, day)

            dirs.map { row + it.first to col + it.second }
                .filter { it.first in grid.indices }
                .filter { it.second in grid[it.first].indices }
                .filter { grid[it.first][it.second] == 1 }
                .forEach {
                    grid[it.first][it.second] = 0
                    coords.offer(Triple(it.first, it.second, third = day + 1))
                }
        }
        if (grid.any { cols -> cols.any { 0 < it } }) maxDay = -1

        return maxDay
    }
}

package lc_1926

import java.util.LinkedList

class Solution {
    private val dirs: Sequence<Pair<Int, Int>> =
        sequenceOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

    fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
        val coords = LinkedList<Triple<Int, Int, Int>>()
            .apply {
                maze[entrance[0]][entrance[1]] = '+'
                offer(Triple(entrance[0], entrance[1], third = 0))
            }
        while (coords.isNotEmpty()) {
            val (row, col, dist) = coords.poll()

            val isEntrance = row == entrance[0] && col == entrance[1]
            if (!isEntrance) {
                val isExit = dirs.map { row + it.first to col + it.second }
                    .any { it.first !in maze.indices || it.second !in maze[it.first].indices }
                if (isExit) return dist
            }

            dirs.map { row + it.first to col + it.second }
                .filter { it.first in maze.indices }
                .filter { it.second in maze[it.first].indices }
                .filter { maze[it.first][it.second] == '.' }
                .forEach { (row, col) ->
                    maze[row][col] = '+'
                    coords.offer(Triple(row, col, third = dist + 1))
                }
        }

        return -1
    }
}

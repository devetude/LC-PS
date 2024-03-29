package lc_547

import java.util.LinkedList

class Solution {
    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val isVisited = BooleanArray(isConnected.size)
        val nextCities = LinkedList<Int>()
        var size = 0
        for (i in isConnected.indices) {
            if (isVisited[i]) continue

            isVisited[i] = true
            nextCities.offer(i)
            ++size

            while (nextCities.isNotEmpty()) {
                isConnected[nextCities.poll()].forEachIndexed { j, c ->
                    if (c == 0 || isVisited[j]) return@forEachIndexed

                    isVisited[j] = true
                    nextCities.offer(j)
                }
            }
        }

        return size
    }
}

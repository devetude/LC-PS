package lc_841

import java.util.LinkedList

class Solution {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val isVisited = BooleanArray(rooms.size).apply { this[0] = true }
        val nextNums = LinkedList<Int>().apply { offer(0) }
        while (nextNums.isNotEmpty()) {
            rooms[nextNums.poll()].forEach { num ->
                if (isVisited[num]) return@forEach

                isVisited[num] = true
                nextNums.offer(num)
            }
        }

        return isVisited.all { it }
    }
}

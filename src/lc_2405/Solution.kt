package lc_2405

class Solution {
    fun partitionString(s: String): Int {
        var isVisited = BooleanArray(size = 26)
        var size = 1
        s.forEach { c ->
            val i = c - 'a'
            if (isVisited[i]) {
                ++size
                isVisited = BooleanArray(size = 26).apply { this[i] = true }
                return@forEach
            }

            isVisited[i] = true
        }

        return size
    }
}

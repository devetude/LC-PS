package lc_1207

class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        arr.forEach { map[it] = map.getOrDefault(it, 0) + 1 }

        val set = HashSet<Int>()
        map.values.forEach { if (!set.add(it)) return false }

        return true
    }
}

package lc_1732

class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var highest = 0
        gain.fold(initial = 0) { acc, diff ->
            (acc + diff).also { if (highest < it) highest = it }
        }

        return highest
    }
}

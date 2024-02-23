package lc_338

class Solution {
    fun countBits(n: Int): IntArray {
        val arr = IntArray(size = n + 1)
        for (i in arr.indices) {
            val half = i shr 1
            arr[i] = arr[half]
            if (half shl 1 < i) ++arr[i]
        }

        return arr
    }
}

package lc_205

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val tOf = hashMapOf<Char, Char>()
        val sOf = hashMapOf<Char, Char>()
        s.forEachIndexed { i, sc ->
            val tc = t[i]
            if (sc !in tOf && tc !in sOf) {
                tOf[sc] = tc
                sOf[tc] = sc
            } else if (tOf[sc] != tc || sOf[tc] != sc) {
                return false
            }
        }

        return true
    }
}

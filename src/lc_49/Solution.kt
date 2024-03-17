package lc_49

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> =
        strs.groupBy { String(it.toCharArray().apply { sort() }) }.values.toList()
}

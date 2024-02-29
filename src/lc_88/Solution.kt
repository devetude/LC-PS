package lc_88

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val tmp = IntArray(nums1.size)
        var left = 0
        var right = 0
        for (i in nums1.indices) {
            tmp[i] = when {
                left == m -> nums2[right++]
                right == n -> nums1[left++]
                nums1[left] <= nums2[right] -> nums1[left++]
                else -> nums2[right++]
            }
        }
        for (i in nums1.indices) nums1[i] = tmp[i]
    }
}

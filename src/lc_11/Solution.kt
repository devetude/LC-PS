package lc_11

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var maxArea = 0
        while (left < right) {
            val width = right - left
            val area = width * if (height[left] < height[right]) height[left++] else height[right--]
            if (maxArea < area) maxArea = area
        }

        return maxArea
    }
}

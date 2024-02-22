package lc_104

import kotlin.math.max

class Solution {
    fun maxDepth(root: TreeNode?): Int =
        root?.let { max(a = maxDepth(it.left) + 1, b = maxDepth(it.right) + 1) } ?: 0
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

package lc_1372

class Solution {
    fun longestZigZag(root: TreeNode?): Int =
        maxOf(dfs(root, shouldGoLeft = true), dfs(root, shouldGoLeft = false))

    private fun dfs(node: TreeNode?, shouldGoLeft: Boolean, level: Int = 0): Int =
        if (shouldGoLeft) {
            node?.left?.let {
                maxOf(
                    dfs(it, shouldGoLeft = false, level = level + 1),
                    dfs(it, shouldGoLeft = true)
                )
            } ?: level
        } else {
            node?.right?.let {
                maxOf(
                    dfs(it, shouldGoLeft = true, level = level + 1),
                    dfs(it, shouldGoLeft = false)
                )
            } ?: level
        }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

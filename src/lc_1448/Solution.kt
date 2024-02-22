package lc_1448

class Solution {
    private var count: Int = 0

    fun goodNodes(root: TreeNode?): Int {
        root?.let { dfs(it, it.`val`) }
        return count
    }

    private fun dfs(root: TreeNode?, max: Int) {
        root ?: return

        var newMax = max
        if (max <= root.`val`) {
            newMax = root.`val`
            ++count
        }

        dfs(root.left, newMax)
        dfs(root.right, newMax)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

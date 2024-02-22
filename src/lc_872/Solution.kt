package lc_872

import java.util.LinkedList

class Solution {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val leaf1 = LinkedList<Int>()
        dfs(root1, leaf1)

        val leaf2 = LinkedList<Int>()
        dfs(root2, leaf2)

        return leaf1 == leaf2
    }

    private fun dfs(node: TreeNode?, leafs: LinkedList<Int>) {
        node ?: return
        if (node.left == null && node.right == null) leafs.add(node.`val`)

        dfs(node.left, leafs)
        dfs(node.right, leafs)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

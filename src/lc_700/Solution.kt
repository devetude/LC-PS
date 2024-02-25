package lc_700

class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? = when {
        root == null -> null
        `val` < root.`val` -> searchBST(root.left, `val`)
        root.`val` < `val` -> searchBST(root.right, `val`)
        else -> root
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

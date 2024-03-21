package lc_112

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        root ?: return false
        if (root.left == null && root.right == null) return targetSum == root.`val`

        val nextTargetSum = targetSum - root.`val`
        return hasPathSum(root.left, nextTargetSum) || hasPathSum(root.right, nextTargetSum)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

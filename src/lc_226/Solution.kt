package lc_226

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        root ?: return null

        val tmp = root.left
        root.left = root.right
        root.right = tmp

        invertTree(root.left)
        invertTree(root.right)

        return root
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

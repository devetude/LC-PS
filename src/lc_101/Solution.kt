package lc_101

class Solution {
    private val leftFirstVisits: ArrayList<Int> = arrayListOf()
    private val rightFirstVisits: ArrayList<Int> = arrayListOf()

    fun isSymmetric(root: TreeNode?): Boolean {
        visitLeftFirst(root?.left)
        visitRightFirst(root?.right)

        return leftFirstVisits == rightFirstVisits
    }

    private fun visitLeftFirst(node: TreeNode?) {
        leftFirstVisits.add(Int.MIN_VALUE)
        node ?: return

        leftFirstVisits.add(node.`val`)
        visitLeftFirst(node.left)
        visitLeftFirst(node.right)
    }

    private fun visitRightFirst(node: TreeNode?) {
        rightFirstVisits.add(Int.MIN_VALUE)
        node ?: return

        rightFirstVisits.add(node.`val`)
        visitRightFirst(node.right)
        visitRightFirst(node.left)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

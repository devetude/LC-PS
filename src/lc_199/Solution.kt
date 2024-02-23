package lc_199

class Solution {
    private val visitedValues: ArrayList<Int> = arrayListOf()

    fun rightSideView(root: TreeNode?): List<Int> {
        dfs(root)

        return visitedValues
    }

    private fun dfs(node: TreeNode?, depth: Int = 0) {
        node ?: return

        if (visitedValues.size == depth) visitedValues.add(node.`val`)

        dfs(node.right, depth = depth + 1)
        dfs(node.left, depth = depth + 1)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main() {
    val root = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(4)
        }
        right = TreeNode(3)
    }

    println(Solution().rightSideView(root))
}

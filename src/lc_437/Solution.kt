package lc_437

class Solution {
    private val isStarted: HashSet<TreeNode?> = hashSetOf()
    private var count: Int = 0

    fun pathSum(root: TreeNode?, targetSum: Int): Int {
        isStarted.add(root)
        dfs(root, targetSum.toLong())

        return count
    }

    private fun dfs(node: TreeNode?, targetSum: Long, sum: Long = 0L) {
        node ?: return
        if (sum + node.`val` == targetSum) ++count

        if (node.left !in isStarted) {
            isStarted.add(node.left)
            dfs(node.left, targetSum, sum = 0)
        }
        dfs(node.left, targetSum, sum = sum + node.`val`)
        if (node.right !in isStarted) {
            isStarted.add(node.right)
            dfs(node.right, targetSum, sum = 0)
        }
        dfs(node.right, targetSum, sum = sum + node.`val`)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main() {
    val root = TreeNode(1).apply {
        right = TreeNode(2).apply {
            right = TreeNode(3).apply {
                right = TreeNode(4).apply {
                    right = TreeNode(5)
                }
            }
        }
    }

    println(Solution().pathSum(root, targetSum = 3))
}

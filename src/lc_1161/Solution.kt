package lc_1161

import java.util.LinkedList

class Solution {
    fun maxLevelSum(root: TreeNode?): Int {
        val nodes = LinkedList<Pair<TreeNode?, Int>>().apply { offer(root to 1) }
        val sumOf = hashMapOf<Int, Int>()
        while (nodes.isNotEmpty()) {
            val (node, lev) = nodes.poll()
            if (node == null) continue

            sumOf[lev] = sumOf.getOrDefault(lev, defaultValue = 0) + node.`val`

            val nextLevel = lev + 1
            nodes.offer(node.left to nextLevel)
            nodes.offer(node.right to nextLevel)
        }

        return sumOf.entries.maxByOrNull { it.value }?.key ?: 0
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main() {
    val root = TreeNode(1).apply {
        left = TreeNode(7).apply {
            left = TreeNode(7)
            right = TreeNode(-8)
        }
        right = TreeNode(0)
    }

    println(Solution().maxLevelSum(root))
}

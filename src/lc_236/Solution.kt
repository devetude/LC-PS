package lc_236

class Solution {
    private val parentOf: HashMap<TreeNode, TreeNode> = hashMapOf()
    private val isVisited: HashSet<TreeNode> = hashSetOf()
    private var lcaNode: TreeNode? = null

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        findParents(root)
        markVisitedNodes(p)
        findLcaNode(q)

        return lcaNode
    }

    private fun findParents(node: TreeNode?) {
        node?.left?.let {
            parentOf[it] = node
            findParents(it)
        }
        node?.right?.let {
            parentOf[it] = node
            findParents(it)
        }
    }

    private fun markVisitedNodes(node: TreeNode?) {
        node ?: return

        isVisited.add(node)
        markVisitedNodes(parentOf[node])
    }

    private fun findLcaNode(node: TreeNode?) {
        node ?: return
        if (node in isVisited) {
            lcaNode = node
            return
        }

        findLcaNode(parentOf[node])
    }
}

class TreeNode(var `val`: Int = 0) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

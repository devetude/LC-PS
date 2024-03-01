package lc_14

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        val root = Node()
        for (str in strs) {
            if (str.isEmpty()) return ""

            var node = root
            for (c in str) {
                if (node.children[c] == null) {
                    node.children[c] = Node(c)
                    if (node == root && 1 < node.children.size) return ""
                }
                node = requireNotNull(node.children[c])
            }
            node.isTerminal = true
        }
        if (root.children.isEmpty()) return ""

        var node = root
        val prefixBuilder = StringBuilder()
        while (!node.isTerminal && node.children.size == 1) {
            node = node.children.values.first()
            prefixBuilder.append(node.c)
        }
        return prefixBuilder.toString()
    }

    private data class Node(val c: Char = ' ') {
        val children: HashMap<Char, Node> = hashMapOf()
        var isTerminal: Boolean = false
    }
}

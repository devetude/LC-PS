package lc_1268

import java.util.TreeMap

class Solution {
    fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
        val root = Node()
        products.forEach(root::add)

        val suggests = mutableListOf<List<String>>()
        val keywordBuilder = StringBuilder()
        searchWord.forEach { c ->
            keywordBuilder.append(c)
            suggests.add(root.suggest(keywordBuilder.toString()))
        }

        return suggests
    }

    private data class Node(val c: Char = ' ') {
        private val children: TreeMap<Char, Node> = TreeMap()
        private var isTerminal: Boolean = false

        fun add(keyword: String) {
            var node = this
            keyword.forEach { c ->
                if (node.children[c] == null) node.children[c] = Node(c)
                node = requireNotNull(node.children[c])
            }
            node.isTerminal = true
        }

        fun suggest(keyword: String): List<String> {
            val suggests = mutableListOf<String>()
            var node = this
            keyword.forEach { c ->
                if (node.children[c] == null) return emptyList()
                node = requireNotNull(node.children[c])
            }

            fun dfs(node: Node, sb: StringBuilder = StringBuilder(keyword)) {
                if (3 <= suggests.size) return
                if (node.isTerminal) suggests.add(sb.toString())

                node.children.values.forEach { child ->
                    dfs(child, StringBuilder(sb).append(child.c))
                }
            }
            dfs(node)

            return suggests
        }
    }
}

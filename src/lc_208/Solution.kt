package lc_208

class Trie {
    private var c: Char = ' '
    private var children: Array<Trie?> = Array(size = 26) { null }
    private var isTerminal: Boolean = false

    fun insert(word: String) {
        var node = this
        word.forEach { c ->
            val i = c - 'a'
            if (node.children[i] == null) node.children[i] = Trie().apply { this.c = c }
            node = requireNotNull(node.children[i])
        }
        node.isTerminal = true
    }

    fun search(word: String): Boolean {
        var node = this
        word.forEach { c ->
            val i = c - 'a'
            if (node.children[i] == null) return false
            node = requireNotNull(node.children[i])
        }

        return node.isTerminal
    }

    fun startsWith(prefix: String): Boolean {
        var node = this
        prefix.forEach { c ->
            val i = c - 'a'
            if (node.children[i] == null) return false
            node = requireNotNull(node.children[i])
        }

        return true
    }
}

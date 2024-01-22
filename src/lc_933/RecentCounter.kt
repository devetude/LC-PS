package lc_933

import java.util.LinkedList
import java.util.Queue

class RecentCounter() {
    private val queue: Queue<Int> = LinkedList()

    fun ping(t: Int): Int {
        val diff = t - TIMEOUT
        while (queue.isNotEmpty() && queue.peek() < diff) queue.poll()
        queue.offer(t)

        return queue.size
    }

    private companion object {
        const val TIMEOUT: Int = 3_000
    }
}

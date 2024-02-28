package lc_2336

import java.util.PriorityQueue

class SmallestInfiniteSet() {
    private var last: Int = 1
    private val pq: PriorityQueue<Int> = PriorityQueue()

    fun popSmallest(): Int = if (pq.isEmpty()) ++last else pq.poll()

    fun addBack(num: Int) {
        if (num < last && num !in pq) pq.offer(num)
    }
}

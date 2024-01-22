package lc_735

import java.util.Stack

class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = Stack<Int>()
        asteroids.forEach { stack.handleCollision(it) }

        return stack.toIntArray()
    }

    private fun Stack<Int>.handleCollision(asteroid: Int) {
        val peekAsteroid = if (isNotEmpty()) peek() else 0
        if (0 < peekAsteroid && asteroid < 0) {
            when {
                peekAsteroid + asteroid < 0 -> pop().also { handleCollision(asteroid) }
                peekAsteroid + asteroid == 0 -> pop()
                else -> Unit
            }

            return
        }
        push(asteroid)
    }
}

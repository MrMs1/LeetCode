package solution

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class Solution1Test {

    @Disabled
    @Test
    fun `0,4,3,0 0`() {
        val target = Solution1()
        val expected = intArrayOf(0, 3)
        val input = intArrayOf(0, 4, 3, 0)
        assertEquals(expected, target.twoSum(input, 0))
    }

    @Disabled
    @Test
    fun `-3,4,3,90`() {
        val target = Solution1()
        val expected = intArrayOf(0, 2)
        val input = intArrayOf(-3, 4, 3, 90)
        assertEquals(expected, target.twoSum(input, 0))
    }
}

package solution

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class Solution347Test {
    private val target = Solution347()

    @ParameterizedTest
    @MethodSource("values")
    fun success(input: IntArray, k: Int, expected: IntArray) {
        assertArrayEquals(expected, target.topKFrequent(input, k))
    }

    companion object {
        @JvmStatic
        fun values(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1, 1, 1, 2, 2, 3), 2, intArrayOf(1, 2)),
                Arguments.of(intArrayOf(5, 3, 1, 1, 1, 3, 73, 1), 2, intArrayOf(1, 3)),
                Arguments.of(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6), 10, intArrayOf(2, 1, 5, 3, 6, 7, 4, 8, 10, 11))
            )
        }
    }
}

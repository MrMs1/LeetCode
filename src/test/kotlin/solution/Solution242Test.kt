package solution

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution242Test {

    @Test
    fun `aacc,ccac`() {
        val target = Solution242()
        assertFalse(target.isAnagram("aacc", "ccac"))
    }
}

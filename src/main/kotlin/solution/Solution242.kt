package solution

class Solution242 {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val left = toMap(s)
        val right = toMap(t)
        val keys = left.keys
        for (i in 0 until left.size) {
            if (left[keys.elementAt(i)] != right[keys.elementAt(i)]) return false
        }
        return true
    }

    private fun toMap(str: String): Map<Char, Int> {
        val result = mutableMapOf<Char, Int>()

        for (i in str.indices) {
            if (i != 0) {
                if (result.contains(str[i])) {
                    result[str[i]]?.plus(1)?.let { result.put(str[i], it) }
                    continue
                }
            }
            result[str[i]] = 1
        }
        return result
    }
}

package solution

class Solution49 {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return strs.groupBy { sort(it) }.values.toList()
    }

    private fun sort(str: String): String {
        val char = str.toCharArray()
        char.sort()
        return String(char)
    }
}

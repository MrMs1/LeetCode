package solution

class Solution217 {
    fun containsDuplicate(nums: IntArray): Boolean {
        val distinct = nums.distinct()
        return distinct.size != nums.size
    }
}

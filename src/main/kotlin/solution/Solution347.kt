package solution

class Solution347 {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val numsMap = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            if (i == 0) {
                numsMap[nums[0]] = 1
                continue
            }
            if (numsMap.containsKey(nums[i])) {
                numsMap[nums[i]]?.plus(1)?.let { numsMap[nums[i]] = it }
                continue
            }
            numsMap[nums[i]] = 1
        }
        val result = IntArray(k)
        var count = 0
        val sortedValues = numsMap.values.sorted().reversed()
        val sortedMap = numsMap.entries.sortedByDescending { it.value }.associate { it.toPair() }
        for ((key, value) in sortedMap) {
            if (count == k) break
            val max = sortedValues[count]
            if (value == max) {
                result[count] = key
                count++
            }
        }
        return result
    }
}

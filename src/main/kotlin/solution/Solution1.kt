package solution

class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        if (target == 0 && nums.min() == 0) {
            var count = 0
            for (i in nums.indices) {
                if (count == 2) return result
                if (nums[i] == 0) {
                    result[count] = i
                    count++
                }
            }
        }
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (i == j) continue
                if (nums[i] + nums[j] == target) {
                    result[0] = i
                    result[1] = j
                    break
                }
            }
        }
        return result
    }
}

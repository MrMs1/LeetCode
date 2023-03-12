package solution

class Solution724 {
    fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
        val distinct = arr.distinct()
        val duplicateMap = mutableMapOf<Int, Int>()
        var nonDistinctCount = 0
        distinct.forEach { value ->
            val size = arr.filter { it == value }.size
            if (size == 1) {
                nonDistinctCount++
            } else {
                duplicateMap[value] = arr.filter { it == value }.size
            }
        }
        println("duplicateMap $duplicateMap")
        val repeat = k - nonDistinctCount
        println("repeat $repeat")
        if (repeat == 0 || nonDistinctCount == arr.size) {
            return k
        }
        if (repeat < 0) {
            if (arr.size == 1) return 1
            return k
        }
        for (i in 1..repeat) {
            val value = duplicateMap.values.min()
            println("value $value")
            val key = duplicateMap.filter { it.value == value }.keys.first()
            val inputValue = value!!.minus(1)
            println("inputValue $inputValue")
            if (inputValue == 0) {
                duplicateMap.remove(key)
            } else {
                duplicateMap[key] = inputValue
            }
        }
        println("duplicateMap $duplicateMap")
        return duplicateMap.size
    }
}

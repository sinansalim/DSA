package `1_Arrays_And_Hashing`


fun main() {
    val ans = topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2)
    print(ans.joinToString())
}

fun topKFrequent2(nums: IntArray, k: Int): IntArray = nums.groupBy { it }
    .mapValues { it.value.count() }
    .entries.sortedByDescending { it.value }
    .take(k).map { it.key }.toIntArray()

fun topKFrequent(nums: IntArray, k: Int): IntArray = mutableMapOf<Int, Int>().apply {
    nums.forEach {
        this[it] = this.getOrDefault(it, 0) + 1
    }
}.entries.sortedByDescending { it.value }.take(k).map { it.key }.toIntArray()

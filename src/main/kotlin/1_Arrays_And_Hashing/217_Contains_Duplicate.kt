package `1_Arrays_And_Hashing`

fun main(args: Array<String>) {
    val ans = containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))
    print(ans)
}

fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()

    nums.forEach { num ->
        if (seen.contains(num)) return true

        seen.add(num)
    }

    return false
}


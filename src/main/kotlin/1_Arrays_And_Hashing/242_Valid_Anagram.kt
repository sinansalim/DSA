package `1_Arrays_And_Hashing`

fun main(args: Array<String>) {
    print(isAnagram("anagram", "nagaram"))
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    // create 2 stack and compare
    // forEach and count
    // forEach and remove
    // create a stack then add and remove
    val hm = mutableMapOf<Char, Int>()
    s.forEach { hm[it] = hm.getOrDefault(it, 0) + 1 }
    t.forEach { hm[it] = hm.getOrDefault(it, 0) - 1 }
    return !hm.any { it.value != 0 }
}




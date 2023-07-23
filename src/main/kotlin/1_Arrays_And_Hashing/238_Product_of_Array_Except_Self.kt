package `1_Arrays_And_Hashing`

fun main(){
    val ans = productExceptSelf(intArrayOf(1,2,3,4))
}
fun productExceptSelf(nums: IntArray){
    /*nums.groupBy { it }.mapValues { it.getProduct() }forEach {

    }*/
    val test = nums.runningFold(10) { prod, num -> prod * num}
    println(test.joinToString())

}

private fun Map.Entry<Int, List<Int>>.getProduct() {

}

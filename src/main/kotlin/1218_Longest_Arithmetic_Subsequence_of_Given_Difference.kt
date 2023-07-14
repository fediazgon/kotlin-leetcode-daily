// TODO: repeat since I had to peek at the solution
class LongestArithmeticSubsequenceOfGivenDifference1218 {

    companion object {

        fun longestSubsequence(arr: IntArray, difference: Int): Int {
            var max = 0
            val dp: MutableMap<Int, Int> = mutableMapOf()
            for (n in arr) {
                if (dp.containsKey(n - difference)) {
                    dp[n] = 1 + dp[n - difference]!!
                } else {
                    dp[n] = 1
                }
                max = maxOf(max, dp[n]!!)
            }
            return max
        }

    }
}
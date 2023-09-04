private val MOVES = listOf(1 to 0, 0 to 1)

fun uniquePaths(m: Int, n: Int): Int {
  val dp = Array(m) { IntArray(n) { -1 } }
  dp.first().fill(1)
  dp.forEach { it[0] = 1 }
  for (i in 1 until m) {
    for (j in 1 until n) {
      dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
    }
  }
  return dp[m - 1][n - 1]
}

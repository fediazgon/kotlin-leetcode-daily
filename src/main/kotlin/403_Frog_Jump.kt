fun canCross(stones: IntArray): Boolean {
  val n = stones.size
  val dp = Array(n) { BooleanArray(n + 1) { false } }
  val stonesMap = stones.withIndex().map { it.value to it.index }.toMap()
  dp[0][0] = true
  for (i in 0 until n) {
    val currPos = stones[i]
    for (k in 0..n) {
      if (dp[i][k]) {
        for (nextJump in listOf(k - 1, k, k + 1)) {
          val nextPos = currPos + nextJump
          if (nextPos in stonesMap) {
            dp[stonesMap[nextPos]!!][nextJump] = true
          }
        }
      }
    }
  }
  return dp[n - 1].any { it }
}

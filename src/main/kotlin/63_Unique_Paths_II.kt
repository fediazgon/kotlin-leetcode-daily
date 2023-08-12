fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
  if (obstacleGrid.last().last() == 1) {
    return 0
  }
  val m = obstacleGrid.size
  val n = obstacleGrid.first().size
  val dp = Array(m) { IntArray(n) { 0 } }
  dp[m - 1][n - 1] = 1
  for (i in m - 1 downTo 0) {
    for (j in n - 1 downTo 0) {
      if (obstacleGrid[i][j] == 0) {
        for (dir in arrayOf(Pair(0, 1), Pair(1, 0))) {
          val iNext = i + dir.first
          val jNext = j + dir.second
          if (iNext < m && jNext < n) {
            dp[i][j] += dp[iNext][jNext]
          }
        }
      }
    }
  }
  return dp[0][0]
}

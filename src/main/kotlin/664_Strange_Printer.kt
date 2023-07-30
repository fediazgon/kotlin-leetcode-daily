fun strangePrinter(s: String): Int {
  return strangePrinterIter(s)
}

private fun strangePrinter(s: String, n: Int, l: Int, r: Int, dp: Array<IntArray>): Int {
  if (dp[l][r] != -1) {
    return dp[l][r]
  }
  dp[l][r] = n
  var j = -1
  for (i in l until r) {
    if (s[i] != s[r] && j == -1) {
      j = i
    }
    if (j != -1) {
      dp[l][r] =
        minOf(dp[l][r], 1 + strangePrinter(s, n, j, i, dp) + strangePrinter(s, n, i + 1, r, dp))
    }
  }
  if (j == -1) {
    dp[l][r] = 0
  }
  return dp[l][r]
}

private fun strangePrinterIter(s: String): Int {
  val n = s.length
  val dp = Array(n) { IntArray(n) { Integer.MAX_VALUE } }
  s.indices.forEach { i ->
    dp[i][i] = 1
    if (i < n - 1) {
      dp[i][i + 1] = if (s[i] == s[i + 1]) 1 else 2
    }
  }
  for (dist in 2 until n) {
    for (left in 0 until n - dist) {
      val right = left + dist
      for (middle in left until right) {
        dp[left][right] = minOf(dp[left][right], dp[left][middle] + dp[middle + 1][right])
      }
      if (s[left] == s[right]) {
        dp[left][right]--
      }
    }
  }
  return dp[0][n - 1]
}

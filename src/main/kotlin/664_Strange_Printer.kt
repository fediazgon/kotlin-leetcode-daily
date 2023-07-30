fun strangePrinter(s: String): Int {
  val n = s.length
  val dp = Array(n) { IntArray(n) { -1 } }
  return strangePrinter(s, n, 0, n - 1, dp) + 1
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

//private fun strangePrinterIter(s: String): Int {
//  val n = s.length
//  val dp = Array(n) { IntArray(n) { Integer.MAX_VALUE } }
//  s.indices.forEach { i ->
//    dp[i][i] = 1
//    if (i < n - 1) {
//      dp[i][i + 1] = if (s[i] == s[i + 1]) 1 else 2
//    }
//  }
//  for (i in 0 until n) {
//    for (j in i + 2 until n) {
//      for (k in i..j) {
//        dp[i][j] = minOf(dp[i][j], dp[i][k] + dp[k + 1][j])
//      }
//      if (s[i] == s[j]) {
//        dp[i][j]--
//      }
//    }
//  }
//  return dp[0][n - 1]
//}

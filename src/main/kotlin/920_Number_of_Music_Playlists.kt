val MOD = (1e9 + 7).toLong()

fun numMusicPlaylists(n: Int, goal: Int, k: Int): Int {
  val dp = Array(goal + 1) { LongArray(n + 1) { -1 } }
  dp[0][0] = 1
  for (i in 1..goal) {
    for (j in i + 1..n) {
      dp[i][j] = 0
    }
  }
  for (i in 1..goal) {
    dp[i][0] = 0
  }
  for (i in 1..n) {
    dp[0][i] = 0
  }
  return numMusicPlaylists(n, k, i = goal, j = n, dp = dp).toInt()
}

fun numMusicPlaylists(n: Int, k: Int, i: Int, j: Int, dp: Array<LongArray>): Long {
  if (dp[i][j] != -1L) {
    return dp[i][j]
  }
  dp[i][j] = numMusicPlaylists(n, k, i - 1, j - 1, dp) * (n - j + 1) % MOD
  if (j > k) {
    dp[i][j] += numMusicPlaylists(n, k, i - 1, j, dp) * (j - k) % MOD
    dp[i][j] %= MOD
  }
  return dp[i][j]
}

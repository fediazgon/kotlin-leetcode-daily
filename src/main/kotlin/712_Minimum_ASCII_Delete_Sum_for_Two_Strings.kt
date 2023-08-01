fun minimumDeleteSum(s1: String, s2: String): Int {
  val dp = Array(s1.length + 1) { IntArray(s2.length + 1) { -1 } }
  fun dp(i: Int, j: Int): Int {
    if (dp[i][j] != -1) return dp[i][j]
    dp[i][j] =
        if (i == s1.length && j == s2.length) 0
        else if (i == s1.length) (j until s2.length).map { s2[it].code }.sum()
        else if (j == s2.length) (i until s1.length).map { s1[it].code }.sum()
        else if (s1[i] == s2[j]) dp(i + 1, j + 1)
        else
            minOf(
                s1[i].code + dp(i + 1, j),
                s2[j].code + dp(i, j + 1),
                s1[i].code + s2[j].code + dp(i + 1, j + 1))
    return dp[i][j]
  }
  return dp(0, 0)
}

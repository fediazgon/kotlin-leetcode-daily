fun isInterleave(s1: String, s2: String, s3: String): Boolean {
  if (s1.length + s2.length != s3.length) {
    return false
  }
  val dp = Array(s1.length) { IntArray(s2.length) { -1 } }
  return isInterleave(s1, s2, s3, 0, 0, 0, dp)
}

private fun isInterleave(
    s1: String,
    s2: String,
    s3: String,
    i: Int,
    j: Int,
    k: Int,
    dp: Array<IntArray>
): Boolean {
  return if (i == s1.length) {
    s3.substring(k) == s2.substring(j)
  } else if (j == s2.length) {
    s3.substring(k) == s1.substring(i)
  } else {
    if (dp[i][j] == -1) {
      dp[i][j] =
          if ((s1[i] == s3[k] && isInterleave(s1, s2, s3, i + 1, j, k + 1, dp)) ||
              (s2[j] == s3[k] && isInterleave(s1, s2, s3, i, j + 1, k + 1, dp)))
              1
          else 0
    }
    dp[i][j] == 1
  }
}

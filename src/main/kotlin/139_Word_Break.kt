fun wordBreak(s: String, wordDict: List<String>): Boolean {
  val dp = IntArray(s.length + 1) { -1 }
  dp[s.length] = 1
  return wordBreak(s, wordDict, 0, dp)
}

fun wordBreak(s: String, wordDict: List<String>, idx: Int, dp: IntArray): Boolean {
  if (dp[idx] != -1) {
    return dp[idx] == 1
  }
  dp[idx] = 0
  val nextS = s.substring(idx)
  for (w in wordDict) {
    if (nextS.startsWith(w) && wordBreak(s, wordDict, idx + w.length, dp)) {
      dp[idx] = 1
      break
    }
  }
  return dp[idx] == 1
}

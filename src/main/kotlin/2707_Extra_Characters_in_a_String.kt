fun minExtraChar(s: String, dictionary: Array<String>): Int {
  val n = s.length
  val dp = IntArray(n) { -1 }
  fun breakString(i: Int): Int {
    if (i > n - 1) {
      return 0
    } else if (dp[i] != -1) (return dp[i])
    var min = Integer.MAX_VALUE
    val w = s.substring(i)
    for (word in dictionary) {
      if (w.startsWith(word)) {
        min = minOf(min, breakString(i + word.length))
      }
    }
    dp[i] = minOf(min, 1 + breakString(i + 1))
    return dp[i]
  }
  return breakString(0)
}

fun change(amount: Int, coins: IntArray): Int = changeBottomUp(amount, coins)

fun changeTopDown(amount: Int, coins: IntArray): Int {
  val dp = Array(amount + 1) { IntArray(coins.size) { -1 } }
  fun f(amount: Int, coinIdx: Int): Int {
    if (amount < 0 || coinIdx > coins.size - 1) {
      return 0
    }
    if (amount == 0) {
      return 1
    }
    if (dp[amount][coinIdx] != -1) {
      return dp[amount][coinIdx]
    }
    dp[amount][coinIdx] = f(amount - coins[coinIdx], coinIdx) + f(amount, coinIdx + 1)
    return dp[amount][coinIdx]
  }
  return f(amount, coinIdx = 0)
}

fun changeBottomUp(amount: Int, coins: IntArray): Int {
  val dp = Array(amount + 1) { IntArray(coins.size) { 0 } }
  dp[0].fill(1)
  for (a in 1..amount) {
    for (c in coins.indices.reversed()) {
      val v = coins[c]
      if (a - v >= 0) {
        dp[a][c] += dp[a - v][c]
      }
      if (c + 1 in coins.indices) {
        dp[a][c] += dp[a][c + 1]
      }
    }
  }
  return dp[amount][0]
}

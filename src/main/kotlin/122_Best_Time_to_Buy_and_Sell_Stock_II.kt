fun maxProfitII(prices: IntArray): Int {
  var totalProfit = 0
  var localMin = Integer.MAX_VALUE
  for (i in prices.indices) {
    val p = prices[i]
    if (p < localMin) {
      localMin = p
    } else if (isLocalMax(prices, i) && i != 0) {
      totalProfit += p - localMin
      localMin = Integer.MAX_VALUE
    }
  }
  return totalProfit
}

private fun isLocalMax(prices: IntArray, idx: Int): Boolean =
    (idx == 0 || prices[idx - 1] <= prices[idx]) &&
        (idx == prices.size - 1 || prices[idx + 1] < prices[idx])

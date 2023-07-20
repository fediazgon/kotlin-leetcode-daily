fun maxProfit(prices: IntArray): Int {
  var maxProfit = 0
  var lowestSeen = Integer.MAX_VALUE
  for (price in prices) {
    if (price < lowestSeen) lowestSeen = price
    else if (price > lowestSeen) {
      maxProfit = maxOf(maxProfit, price - lowestSeen)
    }
  }
  return maxProfit
}

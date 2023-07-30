import kotlin.math.ceil

fun soupServings(n: Int): Double {
  val maxServings = ceil(minOf(5000, n) / 25.0).toInt()
  val dp = Array(maxServings + 1) { DoubleArray(maxServings + 1) { -1.0 } }
  dp[0].fill(1.0)
  dp.forEach { it[0] = 0.0 }
  dp[0][0] = 0.5
  return soupServings(maxServings, maxServings, dp)
}

private fun soupServings(a: Int, b: Int, dp: Array<DoubleArray>): Double {
  val servingA = maxOf(0, a)
  val servingB = maxOf(0, b)
  if (dp[servingA][servingB] != -1.0) {
    return dp[servingA][servingB]
  }
  dp[servingA][servingB] =
    (soupServings(servingA - 4, servingB - 0, dp) +
      soupServings(servingA - 3, servingB - 1, dp) +
      soupServings(servingA - 2, servingB - 2, dp) +
      soupServings(servingA - 1, servingB - 3, dp)) / 4
  return dp[servingA][servingB]
}

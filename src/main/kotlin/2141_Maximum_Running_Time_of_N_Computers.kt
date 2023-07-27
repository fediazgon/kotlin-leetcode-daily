fun maxRunTime(n: Int, batteries: IntArray): Long {
  var lo = 1L
  var hi = batteries.map { it.toLong() }.sum() / n
  var max = 1L
  while (lo <= hi) {
    val targetPower = lo + (hi - lo) / 2
    if (canMetTarget(n, batteries, targetPower)) {
      lo = targetPower + 1
      max = targetPower
    } else {
      hi = targetPower - 1
    }
  }
  return max
}

private fun canMetTarget(n: Int, batteries: IntArray, targetPower: Long): Boolean {
  var currPower = 0L
  for (power in batteries) {
    currPower += minOf(targetPower, power.toLong())
    if (currPower >= targetPower * n) {
      return true
    }
  }
  return false
}

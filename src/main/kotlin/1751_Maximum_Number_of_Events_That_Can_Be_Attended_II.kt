// TODO: repeat since I had to peek at hints

fun maxValue(events: Array<IntArray>, k: Int): Int {
  events.sortBy { it[0] }
  val dp = Array(events.size) { IntArray(k + 1) { -1 } }
  return maxValue(events, k, currEventIdx = 0, dp)
}

fun maxValueBottomUp(events: Array<IntArray>, k: Int): Int {
  events.sortBy { it[0] }
  val dp = Array(k + 1) { IntArray(events.size + 1) { 0 } }
  for (currEventIdx in events.size - 1 downTo 0) {
    for (remainingTickets in 1..k) {
      val (_, endTime, score) = events[currEventIdx]
      val nextEventIdxIfTaken = nextEventIdxAfterTime(events, endTime)
      dp[remainingTickets][currEventIdx] =
          maxOf(
              score + dp[remainingTickets - 1][nextEventIdxIfTaken],
              dp[remainingTickets][currEventIdx + 1])
    }
  }
  return dp[k].max()
}

private fun maxValue(events: Array<IntArray>, k: Int, currEventIdx: Int, dp: Array<IntArray>): Int {
  if (k == 0 || currEventIdx == events.size) {
    return 0
  }
  if (dp[currEventIdx][k] != -1) {
    return dp[currEventIdx][k]
  }
  val (_, endTime, score) = events[currEventIdx]
  val nextEventIdxIfTaken = nextEventIdxAfterTime(events, endTime)
  dp[currEventIdx][k] =
      maxOf(
          score + maxValue(events, k - 1, nextEventIdxIfTaken, dp),
          maxValue(events, k, currEventIdx + 1, dp))
  return dp[currEventIdx][k]
}

private fun nextEventIdxAfterTime(sortedArray: Array<IntArray>, time: Int): Int {
  var lo = 0
  var hi = sortedArray.size - 1
  var idx = sortedArray.size
  while (lo <= hi) {
    val mid = lo + ((hi - lo) / 2)
    val eventStart = sortedArray[mid][0]
    if (eventStart > time) {
      idx = mid
      hi = mid - 1
    } else {
      lo = mid + 1
    }
  }
  return idx
}

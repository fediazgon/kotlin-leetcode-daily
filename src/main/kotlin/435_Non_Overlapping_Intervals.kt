fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
  if (intervals.size < 2) {
    return 0
  }
  intervals.sortBy { it[0] }
  var removed = 0
  var i = 0
  var j = 1
  while (j < intervals.size) {
    val curr = intervals[i]
    val next = intervals[j]
    if (overlap(curr, next)) {
      removed++
      if (curr[1] > next[1]) {
        i = j
      }
      j++
    } else {
      i = j
      j++
    }
  }
  return removed
}

private fun overlap(a: IntArray, b: IntArray): Boolean = (b[1] >= a[0] && b[0] < a[1])

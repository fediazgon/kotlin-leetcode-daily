fun findLongestChain(pairs: Array<IntArray>): Int {
  val pairsSorted = pairs.sortedBy { it[0] }
  var count = 1
  var prev = pairsSorted[0]
  for (curr in pairsSorted.drop(1)) {
    if (overlap(prev, curr)) {
      prev = if (curr[1] < prev[1]) curr else prev
    } else {
      count++
      prev = curr
    }
  }
  return count
}

private fun overlap(p1: IntArray, p2: IntArray): Boolean {
  return p2[0] <= p1[1] && p2[1] >= p1[0]
}

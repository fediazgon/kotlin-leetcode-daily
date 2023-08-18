fun maximalNetworkRank(n: Int, roads: Array<IntArray>): Int {
  val adj = mutableMapOf<Int, MutableSet<Int>>().withDefault { mutableSetOf() }
  roads.forEach {
    adj.computeIfAbsent(it[0]) { mutableSetOf() }.add(it[1])
    adj.computeIfAbsent(it[1]) { mutableSetOf() }.add(it[0])
  }
  var max = 0
  for (i in 0 until n) {
    for (j in i + 1 until n) {
      val connectionsToI = adj.getValue(i)
      val connectionsToJ = adj.getValue(j)
      max =
          maxOf(max, connectionsToI.size + connectionsToJ.size - if (j in connectionsToI) 1 else 0)
    }
  }
  return max
}

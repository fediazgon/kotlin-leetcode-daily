fun sortItems(n: Int, m: Int, group: IntArray, beforeItems: List<List<Int>>): IntArray {
  var groupId = m
  val groups = group.map { if (it == -1) groupId++ else it }.toIntArray()

  val itemGraph = List(n) { mutableListOf<Int>() }
  val itemInDegree = IntArray(n)
  val groupGraph = List(groupId) { mutableListOf<Int>() }
  val groupInDegree = IntArray(groupId)

  for ((curr, prevItems) in beforeItems.withIndex()) {
    for (prev in prevItems) {
      itemGraph[prev].add(curr)
      itemInDegree[curr] += 1
      if (groups[prev] != groups[curr]) {
        groupGraph[groups[prev]].add(groups[curr])
        groupInDegree[groups[curr]] += 1
      }
    }
  }

  val itemOrder = topologicalSort(itemGraph, itemInDegree)
  val groupOrder = topologicalSort(groupGraph, groupInDegree)

  if (itemOrder.isEmpty() || groupOrder.isEmpty()) {
    return intArrayOf()
  }

  val orderedGroups: MutableMap<Int, MutableList<Int>> = mutableMapOf()
  for (item in itemOrder) {
    orderedGroups.computeIfAbsent(groups[item]) { mutableListOf() }.add(item)
  }

  val answerList: MutableList<Int> = mutableListOf()
  for (groupIndex in groupOrder) {
    answerList.addAll(orderedGroups.getOrDefault(groupIndex, mutableListOf()))
  }

  return answerList.toIntArray()
}

private fun topologicalSort(graph: List<List<Int>>, inDegree: IntArray): List<Int> {
  val visited = mutableListOf<Int>()
  val q = ArrayDeque<Int>()
  for ((e, deg) in inDegree.withIndex()) {
    if (deg == 0) {
      q.addLast(e)
    }
  }

  while (!q.isEmpty()) {
    val e = q.removeFirst()
    visited.add(e)

    for (prev in graph[e]) {
      inDegree[prev] -= 1
      if (inDegree[prev] == 0) {
        q.addLast(prev)
      }
    }
  }

  return if (visited.size == graph.size) visited else emptyList()
}

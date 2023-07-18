fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
  val adjList: List<MutableList<Int>> = List(numCourses) { mutableListOf<Int>() }
  for (req in prerequisites) {
    val course = req[0]
    val prerequisite = req[1]
    adjList[course].add(prerequisite)
  }
  for (course in adjList.indices) {
    if (!dfs(course, adjList, BooleanArray(numCourses), BooleanArray(numCourses))) {
      return false
    }
  }
  return true
}

private fun dfs(
    course: Int,
    adjList: List<List<Int>>,
    visited: BooleanArray,
    inStack: BooleanArray
): Boolean {
  if (inStack[course]) {
    return false
  }
  if (visited[course]) {
    return true
  }
  inStack[course] = true
  visited[course] = true
  for (dep in adjList[course]) {
    if (!dfs(dep, adjList, visited, inStack)) {
      return false
    }
  }
  inStack[course] = false
  return true
}

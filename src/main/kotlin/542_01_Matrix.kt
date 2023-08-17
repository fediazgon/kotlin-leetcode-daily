import java.util.*

fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
  val q = LinkedList<Pair<Int, Int>>()
  val dis = Array(mat.size) { IntArray(mat.first().size) { -1 } }
  for (i in mat.indices) {
    for (j in mat.first().indices) {
      if (mat[i][j] == 0) {
        q.add(i to j)
      }
    }
  }
  bfs(q, dis)
  dis.forEach { println(it.joinToString(separator = " ")) }
  return dis
}

private fun bfs(q: Queue<Pair<Int, Int>>, dis: Array<IntArray>) {
  var d = 0
  while (!q.isEmpty()) {
    val s = q.size
    for (i in 0 until s) {
      val c = q.remove()
      if (dis[c.first][c.second] != -1) {
        continue
      }
      dis[c.first][c.second] = d
      for (move in listOf(Pair(1, 0), Pair(-1, 0), Pair(0, 1), Pair(0, -1))) {
        val next = c.first + move.first to c.second + move.second
        if (next.first >= 0 &&
            next.first < dis.size &&
            next.second >= 0 &&
            next.second < dis.first().size &&
            dis[next.first][next.second] == -1) {
          q.add(next)
        }
      }
    }
    d += 1
  }
}

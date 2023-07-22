import kotlin.math.abs

fun knightProbability(n: Int, k: Int, row: Int, column: Int): Double {
  val dp: Array<Array<DoubleArray>> = Array(k + 1) { Array(n) { DoubleArray(n) { -1.0 } } }
  fun knightProbabilityRec(n: Int, k: Int, row: Int, column: Int): Double {
    if (!inBounds(n, row, column)) {
      return 0.0
    }
    if (k == 0) {
      return 1.0
    }
    if (dp[k][row][column] != -1.0) {
      return dp[k][row][column]
    }
    var sum = 0.0
    for (rDelta in intArrayOf(-2, -1, 2, 1)) {
      for (cDelta in intArrayOf(-2, -1, 2, 1)) {
        if (abs(rDelta) != abs(cDelta)) {
          sum += knightProbabilityRec(n, k - 1, row + rDelta, column + cDelta)
        }
      }
    }
    dp[k][row][column] = sum / 8.0
    return dp[k][row][column]
  }
  return knightProbabilityRec(n, k, row, column)
}

private fun inBounds(n: Int, row: Int, column: Int): Boolean {
  return row >= 0 && column >= 0 && row < n && column < n
}

// Memory exceeded due to moves.size being 1 -> 8 -> 64 -> 512 -> 4098... for (n=25, r=12, c=12)
// fun knightProbability(n: Int, k: Int, row: Int, column: Int): Double {
//  val moves = ArrayDeque<Pair<Int, Int>>()
//  moves.addLast(row to column)
//  var prob = 1.0
//  for (i in 1..k) {
//    var inPos = 0
//    var totalPos = 0
//    for (m in 0 until moves.size) {
//      val (r, c) = moves.removeFirst()
//      for (rDelta in intArrayOf(-2, -1, 2, 1)) {
//        for (cDelta in intArrayOf(-2, -1, 2, 1)) {
//          if (abs(rDelta) != abs(cDelta)) {
//            val rNew = r + rDelta
//            val cNew = c + cDelta
//            if (inBounds(n, rNew, cNew)) {
//              inPos++
//              moves.addLast(rNew to cNew)
//            }
//            totalPos++
//          }
//        }
//      }
//    }
//    val currProb = if (totalPos == 0) 0.0 else  inPos / totalPos.toDouble()
//    prob *= currProb
//  }
//  return prob
// }

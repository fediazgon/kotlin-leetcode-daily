fun combine(n: Int, k: Int): List<List<Int>> {
  val comb = mutableListOf<List<Int>>()
  combine(comb, mutableListOf(), 1, n, k)
  return comb
}

private fun combine(comb: MutableList<List<Int>>, curr: MutableList<Int>, i: Int, n: Int, k: Int) {
  if (curr.size == k) {
    comb.add(curr.toList())
  } else if (i <= n) {
    curr.add(i)
    combine(comb, curr, i + 1, n, k)
    curr.removeAt(curr.lastIndex)
    combine(comb, curr, i + 1, n, k)
  }
}

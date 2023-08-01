fun combine(n: Int, k: Int): List<List<Int>> = combineIter(n, k)

private fun combineRec(n: Int, k: Int): List<List<Int>> {
  val comb = mutableListOf<List<Int>>()
  combineRec(comb, mutableListOf(), 1, n, k)
  return comb
}

private fun combineRec(
    comb: MutableList<List<Int>>,
    curr: MutableList<Int>,
    i: Int,
    n: Int,
    k: Int
) {
  if (curr.size == k) {
    comb.add(curr.toList())
  } else if (i <= n) {
    curr.add(i)
    combineRec(comb, curr, i + 1, n, k)
    curr.removeAt(curr.lastIndex)
    combineRec(comb, curr, i + 1, n, k)
  }
}

private fun combineIter(n: Int, k: Int): List<List<Int>> {
  var combCurr: List<LinkedHashSet<Int>> = (1..n).map { LinkedHashSet(listOf(it)) }.toList()
  for (s in 2..k) {
    val tmp: MutableList<LinkedHashSet<Int>> = mutableListOf()
    for (c in combCurr) {
      for (i in 1..n) {
        if (!c.contains(i)) {
          val next = c + i
          if (!tmp.contains(next)) {
            tmp.add(next as LinkedHashSet<Int>)
          }
        }
      }
    }
    combCurr = tmp
  }
  return combCurr.map { it.toList() }
}

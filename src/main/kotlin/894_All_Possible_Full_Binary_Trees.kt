import model.TreeNode

// TODO: do bottom-down
fun allPossibleFBT(n: Int): List<TreeNode<Int>?> {
  return allPossibleFBTMemo(n)
}

private fun allPossibleFBTMemo(n: Int): List<TreeNode<Int>?> {
  val dp = Array<List<TreeNode<Int>?>?>(n + 1) { null }
  dp[1] = listOf(TreeNode(0))
  return allPossibleFBTMemo(n, dp)
}

private fun allPossibleFBTMemo(n: Int, dp: Array<List<TreeNode<Int>?>?>): List<TreeNode<Int>?> {
  if (n % 2 == 0) {
    return listOf()
  }
  if (dp[n] != null) {
    return dp[n]!!
  }
  val l = mutableListOf<TreeNode<Int>?>()
  for (nNext in 1..n - 2 step 2) {
    val left = allPossibleFBTMemo(nNext, dp)
    val right = allPossibleFBTMemo(n - nNext - 1, dp)
    for (lNode in left) {
      for (rNode in right) {
        val node = TreeNode(0)
        node.right = rNode
        node.left = lNode
        l.add(node)
      }
    }
  }
  dp[n] = l
  return l
}

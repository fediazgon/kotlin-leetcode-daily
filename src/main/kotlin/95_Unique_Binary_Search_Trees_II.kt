import model.TreeNode

fun generateTrees(n: Int): List<TreeNode<Int>?> = generateTrees(1, n)

private fun generateTrees(min: Int, max: Int): List<TreeNode<Int>?> {
  if (min > max) {
    return listOf(null)
  }
  val trees = mutableListOf<TreeNode<Int>>()
  for (nextVal in (min..max)) {
    val node = TreeNode(nextVal)
    for (rightVal in generateTrees(nextVal + 1, max)) {
      node.right = rightVal
      for (leftVal in generateTrees(min, nextVal - 1)) {
        node.left = leftVal
        trees.add(clone(node))
      }
    }
  }
  return trees
}

private fun <T : Any> clone(t: TreeNode<T>): TreeNode<T> =
    TreeNode(t.`val`, t.left?.let { clone(it) }, t.right?.let { clone(it) })

import model.TreeNode

fun generateTrees(n: Int): List<TreeNode<Int>?> = generateTrees(1, n)

private fun generateTrees(min: Int, max: Int): List<TreeNode<Int>?> {
  if (min > max) {
    return listOf(null)
  }
  val trees = mutableListOf<TreeNode<Int>>()
  for (nextVal in (min..max)) {
    for (rightVal in generateTrees(nextVal + 1, max)) {
      for (leftVal in generateTrees(min, nextVal - 1)) {
        trees.add(TreeNode(nextVal, leftVal, rightVal))
      }
    }
  }
  return trees
}

package model

data class TreeNode<T : Any>(var `val`: T, var left: TreeNode<T>?, var right: TreeNode<T>?) {
  constructor(`val`: T) : this(`val`, null, null)

  override fun toString(): String = levelOrderTraversal().joinToString(", ", "[", "]")

  private fun levelOrderTraversal(): List<T?> {
    val traversal = mutableListOf<T?>()
    val q = ArrayDeque<TreeNode<T>?>()
    q.addLast(this)
    var size = 0
    var idxLastValue = 0
    while (!q.isEmpty()) {
      for (i in 1..q.size) {
        val node = q.removeFirst()
        if (node == null) {
          traversal.add(null)
        } else {
          traversal.add(node.`val`)
          q.addLast(node.left)
          q.addLast(node.right)
          idxLastValue = size
        }
        size++
      }
    }
    return traversal.subList(0, idxLastValue + 1) // remove trailing nulls
  }
}

fun <T : Any> treeFromLevelOrder(elements: Array<T?>): TreeNode<T>? {
  if (elements.isEmpty() || elements.first() == null) {
    return null
  }
  val root = TreeNode(elements[0]!!)
  val q = ArrayDeque<TreeNode<T>>()
  q.addLast(root)
  var i = 1
  while (i < elements.size) {
    for (j in 1..q.size) {
      val node = q.removeFirst()
      if (i < elements.size) {
        elements[i++]?.let { e -> node.left = TreeNode(e).also { q.addLast(it) } }
      }
      if (i < elements.size) {
        elements[i++]?.let { e -> node.right = TreeNode(e).also { q.addLast(it) } }
      }
    }
  }
  return root
}

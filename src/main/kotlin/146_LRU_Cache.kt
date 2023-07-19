class LRUCache(private val capacity: Int) {

  private var size = 0
  private var head: Node? = null
  private var tail: Node? = null

  class Node(val k: Int, var v: Int) {
    var prev: Node? = null
    var next: Node? = null
  }

  private val map = mutableMapOf<Int, Node>()

  fun get(key: Int): Int {
    return if (key in map) {
      val node = map.getValue(key)
      floatToFirst(node)
      node.v
    } else -1
  }

  fun put(key: Int, value: Int) {
    if (key in map) {
      val node = map.getValue(key)
      node.v = value
      floatToFirst(node)
    } else {
      if (size == capacity) {
        val last = tail!!
        map.remove(last.k)
        unlink(last)
        size--
      }
      Node(key, value).also { addFirst(it) }.also { map[key] = it }
      size++
    }
  }

  private fun floatToFirst(node: Node) {
    unlink(node)
    addFirst(node)
  }

  private fun addFirst(n: Node) {
    head?.let { it.prev = n }
    n.prev = null
    n.next = head
    head = n
    if (tail == null) tail = n
  }

  private fun unlink(node: Node) {
    val prev = node.prev
    val next = node.next
    prev?.let { it.next = next }
    next?.let { it.prev = prev }
    if (node == head) head = next
    if (node == tail) tail = prev
  }
}

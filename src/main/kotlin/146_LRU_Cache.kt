class LRUCache(private val capacity: Int) {

  private var size = 0
  private var head: Node? = null
  private var tail: Node? = null

  class Node(val k: Int, var v: Int) {
    var prev: Node? = null
    var next: Node? = null
  }

  private val map = mutableMapOf<Int, Node>()

  fun get(key: Int): Int = map[key]?.also { remove(it) }?.also { addFirst(it) }?.v ?: -1

  fun put(key: Int, value: Int) {
    map.compute(key) { _, node ->
          if (node == null) Node(key, value)
          else {
            node.v = value
            remove(node)
            node
          }
        }
        ?.also { addFirst(it) }
  }

  private fun addFirst(n: Node) {
    if (size == capacity) map.remove(removeLast())
    head?.let { it.prev = n }
    n.prev = null
    n.next = head
    head = n
    if (tail == null) tail = n
    size++
  }

  private fun removeLast(): Int {
    val last = tail!!
    val tailPrev = last.prev
    tailPrev?.let { it.next = null }
    tail = tailPrev
    size--
    return last.k
  }

  private fun remove(node: Node) {
    val prev = node.prev
    val next = node.next
    prev?.let { it.next = next }
    next?.let { it.prev = prev }
    if (node == head) head = next
    if (node == tail) tail = prev
    size--
  }
}

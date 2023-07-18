package model

class ListNodeIterator<T>(private var l: ListNode<T>?) : Iterator<T> {
  override fun hasNext(): Boolean = l != null
  override fun next(): T = l?.also { l = it.next }!!.`val`
}

data class ListNode<T>(var `val`: T, var next: ListNode<T>?) : Iterable<T> {
  constructor(v: T) : this(v, null)
  override fun iterator(): Iterator<T> = ListNodeIterator(this)
  override fun toString(): String = this.joinToString(",", "[", "]")
}

fun <T> listNodeOf(vararg elements: T): ListNode<T> {
  return elements.foldRight(null as ListNode<T>?) { e, acc -> ListNode(e, acc) }!!
}

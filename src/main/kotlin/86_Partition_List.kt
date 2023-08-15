import model.ListNode

fun partition(head: ListNode<Int>?, x: Int): ListNode<Int>? {
  val headP1 = ListNode(-1)
  val headP2 = ListNode(-1)
  var p1 = headP1
  var p2 = headP2
  var curr = head
  while (curr != null) {
    val v = curr.`val`
    if (v < x) {
      p1.next = ListNode(v).also { p1 = it }
    } else {
      p2.next = ListNode(v).also { p2 = it }
    }
    curr = curr.next
  }
  p1.next = headP2.next
  return headP1.next
}

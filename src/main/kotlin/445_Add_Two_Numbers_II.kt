import model.ListNode

fun addTwoNumbers(l1: ListNode<Int>?, l2: ListNode<Int>?): ListNode<Int>? {
  var carry = 0
  val dummy = ListNode(0)
  var curr = dummy
  var a: ListNode<Int>? = reverse(l1)
  var b: ListNode<Int>? = reverse(l2)
  while (a != null || b != null) {
    var sum = carry
    a?.let { sum += it.`val` }
    b?.let { sum += it.`val` }
    carry = sum / 10
    curr.next = ListNode(sum % 10)
    curr = curr.next!!
    a?.let { a = it.next }
    b?.let { b = it.next }
  }
  if (carry != 0) {
    curr.next = ListNode(carry)
  }
  return reverse(dummy.next)
}

private fun <T> reverse(l: ListNode<T>?): ListNode<T>? {
  if (l == null) {
    return null
  }
  var prev: ListNode<T>? = null
  var curr: ListNode<T>? = l
  while (curr != null) {
    val tmp = curr.next
    curr.next = prev
    prev = curr
    curr = tmp
  }
  return prev!!
}

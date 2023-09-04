import model.ListNode

fun <T> hasCycle(head: ListNode<T>?): Boolean {
  if (head?.next == null) {
    return false
  }
  var slow = head
  var fast = head
  do {
    slow = slow?.next
    fast = fast?.next?.next
  } while (fast !== slow && fast?.next !== null)
  return fast === slow
}

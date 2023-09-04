import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import model.listNodeOf

class LinkedListCycle141Test {

  @Test
  fun example1() {
    val h = listNodeOf(3, 2, 0, 4)
    h.next!!.next!!.next!!.next = h.next
    assertTrue(hasCycle(h))
  }

  @Test
  fun example2() {
    val h = listNodeOf(1, 2)
    h.next!!.next = h
    assertTrue(hasCycle(h))
  }

  @Test
  fun example3() {
    val h = listNodeOf(1)
    assertFalse(hasCycle(h))
  }

  @Test
  fun example4() {
    val h = listNodeOf(1, 2)
    assertFalse(hasCycle(h))
  }
}

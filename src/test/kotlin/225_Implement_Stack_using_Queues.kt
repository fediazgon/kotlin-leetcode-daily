import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class ImplementStackUsingQueues225Test {

  @Test
  fun example1() {
    val s = MyStack()
    s.push(1)
    s.push(2)
    s.push(3)
    s.push(4)
    s.push(2)
    assertEquals(2, s.top())
    assertEquals(2, s.pop())
    assertEquals(4, s.pop())
    assertFalse(s.empty())
    assertEquals(3, s.pop())
  }
}

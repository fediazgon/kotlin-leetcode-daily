import kotlin.test.Test
import kotlin.test.assertEquals

class LRUCache146Test {

  @Test
  fun testExample() {
    val c = LRUCache(2)
    c.put(1, 0)
    c.put(2, 2)
    assertEquals(0, c.get(1))
    c.put(3, 3)
    assertEquals(-1, c.get(2))
    c.put(4, 4)
    assertEquals(-1, c.get(1))
    assertEquals(3, c.get(3))
    assertEquals(4, c.get(4))
  }
}

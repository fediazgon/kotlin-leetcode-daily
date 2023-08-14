import kotlin.test.Test
import kotlin.test.assertEquals

class FindKLargest2369Test {

  @Test
  fun example1() {
    assertEquals(5, findKthLargest(intArrayOf(4, 4, 4, 5, 6), 2))
  }

  @Test
  fun example2() {
    assertEquals(4, findKthLargest(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), 4))
  }
}

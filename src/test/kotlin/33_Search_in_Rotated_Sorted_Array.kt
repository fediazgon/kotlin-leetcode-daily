import kotlin.test.Test
import kotlin.test.assertEquals

class SearchInRotatedSortedArray33Test {

  @Test
  fun example1() {
    assertEquals(4, search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0))
  }

  @Test
  fun example2() {
    assertEquals(6, search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 2))
  }

  @Test
  fun example3() {
    assertEquals(-1, search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3))
  }

  @Test
  fun example4() {
    assertEquals(-1, search(intArrayOf(1), 0))
  }
}

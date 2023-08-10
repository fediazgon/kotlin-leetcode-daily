import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SearchInRotatedSortedArrayII81Test {

  @Test
  fun example1() {
    assertTrue(searchII(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0))
  }

  @Test
  fun example2() {
    assertTrue(searchII(intArrayOf(4, 5, 6, 7, 0, 1, 2), 2))
  }

  @Test
  fun example3() {
    assertFalse(searchII(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3))
  }

  @Test
  fun example4() {
    assertFalse(searchII(intArrayOf(1), 0))
  }

  @Test
  fun example5() {
    assertTrue(searchII(intArrayOf(1, 0, 1, 1, 1), 0))
  }

  @Test
  fun example6() {
    assertTrue(searchII(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1), 2))
  }

  @Test
  fun example7() {
    assertTrue(
        searchII(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), 13))
  }
}

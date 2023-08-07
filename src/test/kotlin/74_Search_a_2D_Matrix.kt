import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SearchA2DMatrix74Test {

  @Test
  fun example1() {
    assertTrue(
        searchMatrix(
            arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 60)),
            3))
  }

  @Test
  fun example2() {
    assertFalse(
        searchMatrix(
            arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 60)),
            13))
  }
}

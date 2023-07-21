import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfLongestIncreasingSubsequence673Test {

  @Test
  fun example1() {
    assertEquals(2, findNumberOfLIS(intArrayOf(1, 3, 5, 4, 7)))
  }

  @Test
  fun example2() {
    assertEquals(5, findNumberOfLIS(intArrayOf(2, 2, 2, 2, 2)))
  }

  @Test
  fun example3() {
    assertEquals(1, findNumberOfLIS(intArrayOf(8, 9, 1, 2, 3)))
  }

  @Test
  fun example4() {
    assertEquals(2, findNumberOfLIS(intArrayOf(1, 2, 3, -3, -2, -1)))
  }
}

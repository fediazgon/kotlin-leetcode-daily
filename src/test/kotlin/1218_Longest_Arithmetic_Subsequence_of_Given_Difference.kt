import kotlin.test.Test
import kotlin.test.assertEquals

internal class LongestArithmeticSubsequenceOfGivenDifference1218Test {

  @Test
  fun example1() {
    assertEquals(4, longestSubsequence(intArrayOf(1, 2, 3, 4), 1))
  }

  @Test
  fun example2() {
    assertEquals(1, longestSubsequence(intArrayOf(1, 3, 5, 7), 1))
  }

  @Test
  fun example3() {
    assertEquals(4, longestSubsequence(intArrayOf(1, 5, 7, 8, 5, 3, 4, 2, 1), -2))
  }

  @Test
  fun example4() {
    assertEquals(
        2, longestSubsequence(intArrayOf(4, 12, 10, 0, -2, 7, -8, 9, -9, -12, -12, 8, 8), 0))
  }
}

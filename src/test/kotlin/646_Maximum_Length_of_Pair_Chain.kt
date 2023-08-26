import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumLengthOfPairChain646Test {

  @Test
  fun example1() {
    assertEquals(2, findLongestChain(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4))))
  }

  @Test
  fun example2() {
    assertEquals(3, findLongestChain(arrayOf(intArrayOf(1, 2), intArrayOf(7, 8), intArrayOf(4, 5))))
  }

  @Test
  fun example3() {
    assertEquals(
        3,
        findLongestChain(
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 10), intArrayOf(4, 5), intArrayOf(6, 7))))
  }

  @Test
  fun example4() {
    assertEquals(
        2, findLongestChain(arrayOf(intArrayOf(1, 2), intArrayOf(3, 10), intArrayOf(4, 5))))
  }

  @Test
  fun example5() {
    assertEquals(
        4,
        findLongestChain(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(3, 4),
                intArrayOf(5, 10),
                intArrayOf(7, 8),
                intArrayOf(9, 10))))
  }

  @Test
  fun example6() {
    assertEquals(2, findLongestChain(arrayOf(intArrayOf(3, 4), intArrayOf(2, 3), intArrayOf(1, 2))))
  }
}

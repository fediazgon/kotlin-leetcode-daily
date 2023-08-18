import kotlin.test.Test
import kotlin.test.assertEquals

class MaximalNetworkRank1615Test {

  @Test
  fun example1() {
    assertEquals(
        4,
        maximalNetworkRank(
            4, arrayOf(intArrayOf(0, 1), intArrayOf(0, 3), intArrayOf(1, 2), intArrayOf(1, 3))))
  }

  @Test
  fun example2() {
    assertEquals(
        5,
        maximalNetworkRank(
            8,
            arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 2),
                intArrayOf(2, 3),
                intArrayOf(2, 4),
                intArrayOf(5, 6),
                intArrayOf(5, 7))))
  }

  @Test
  fun example3() {
    assertEquals(1, maximalNetworkRank(3, arrayOf(intArrayOf(0, 1))))
  }

  @Test
  fun example4() {
    assertEquals(0, maximalNetworkRank(3, arrayOf()))
  }
}

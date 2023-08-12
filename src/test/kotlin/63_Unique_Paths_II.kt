import kotlin.test.Test
import kotlin.test.assertEquals

class UniquePathsII63Test {

  @Test
  fun example1() {
    assertEquals(
        2,
        uniquePathsWithObstacles(
            arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))))
  }

  @Test
  fun example2() {
    assertEquals(1, uniquePathsWithObstacles(arrayOf(intArrayOf(0, 1), intArrayOf(0, 0))))
  }

  @Test
  fun example3() {
    assertEquals(
        6,
        uniquePathsWithObstacles(
            arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))))
  }

  @Test
  fun example4() {
    assertEquals(0, uniquePathsWithObstacles(arrayOf(intArrayOf(0, 0), intArrayOf(0, 1))))
  }
}

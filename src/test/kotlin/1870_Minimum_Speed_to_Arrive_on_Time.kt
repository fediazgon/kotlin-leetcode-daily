import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumSPeedToArriveOnTime1870Test {

  @Test
  fun example1() {
    assertEquals(1, minSpeedOnTime(intArrayOf(1, 3, 2), 6.0))
  }

  @Test
  fun example2() {
    assertEquals(3, minSpeedOnTime(intArrayOf(1, 3, 2), 2.7))
  }

  @Test
  fun example3() {
    assertEquals(-1, minSpeedOnTime(intArrayOf(1, 3, 2), 1.9))
  }

  @Test
  fun example4() {
    assertEquals(100, minSpeedOnTime(intArrayOf(1, 1, 1), 2.01))
  }

  @Test
  fun example5() {
    assertEquals(10000000, minSpeedOnTime(intArrayOf(1, 1, 100000), 2.01))
  }
}

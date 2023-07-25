import kotlin.test.Test
import kotlin.test.assertEquals

class PeakIndexInAMountainArray852Test {

  @Test
  fun example1() {
    assertEquals(1, peakIndexInMountainArray(intArrayOf(0, 1, 0)))
  }

  @Test
  fun example2() {
    assertEquals(1, peakIndexInMountainArray(intArrayOf(0, 2, 1, 0)))
  }

  @Test
  fun example3() {
    assertEquals(1, peakIndexInMountainArray(intArrayOf(0, 10, 5, 2)))
  }

  @Test
  fun example4() {
    assertEquals(3, peakIndexInMountainArray(intArrayOf(0, 1, 2, 3, 2)))
  }

  @Test
  fun example5() {
    assertEquals(1, peakIndexInMountainArray(intArrayOf(2, 3, 2, 1, 0)))
  }
}

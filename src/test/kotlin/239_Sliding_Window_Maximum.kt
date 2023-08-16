import kotlin.test.Test
import kotlin.test.assertContentEquals

class SlidingWindowMaximum239Test {

  @Test
  fun example1() {
    assertContentEquals(
        intArrayOf(3, 3, 5, 5, 6, 7), maxSlidingWindow(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3))
  }

  @Test
  fun example2() {
    assertContentEquals(intArrayOf(1), maxSlidingWindow(intArrayOf(1), 1))
  }

  @Test
  fun example3() {
    assertContentEquals(
        intArrayOf(4, 3, 2, -1), maxSlidingWindow(intArrayOf(4, 3, 2, -1, -2, -3), 3))
  }

  @Test
  fun example4() {
    assertContentEquals(intArrayOf(4, 3, 3, 2), maxSlidingWindow(intArrayOf(4, 2, 3, 2, 2, 2), 3))
  }

  @Test
  fun example5() {
    assertContentEquals(
        intArrayOf(9, 9, 10, 10, 10, 10, 10, 10, 10, 9, 9, 9, 8, 8),
        maxSlidingWindow(
            intArrayOf(-6, -10, -7, -1, -9, 9, -8, -4, 10, -5, 2, 9, 0, -7, 7, 4, -2, -10, 8, 7),
            7))
  }

  @Test
  fun example6() {
    assertContentEquals(
        intArrayOf(10, 10, 9, 2), maxSlidingWindow(intArrayOf(9, 10, 9, -7, -4, -8, 2, -6), 5))
  }
}

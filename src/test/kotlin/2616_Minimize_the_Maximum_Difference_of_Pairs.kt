import kotlin.test.Test
import kotlin.test.assertEquals

class MinimizeTheMaximumDifferenceOfPairs2616Test {

  @Test
  fun example1() {
    assertEquals(1, minimizeMax(intArrayOf(10, 1, 2, 7, 1, 3), 2))
  }

  @Test
  fun example2() {
    assertEquals(0, minimizeMax(intArrayOf(4, 2, 1, 2), 1))
  }

  @Test
  fun example3() {
    assertEquals(1, minimizeMax((0..10E5.toInt()).toList().toIntArray(), 10E5.toInt() / 2))
  }

  @Test
  fun example4() {
    assertEquals(0, minimizeMax(intArrayOf(0, 5, 3, 4), 0))
  }

  @Test
  fun example5() {
    assertEquals(1, minimizeMax(intArrayOf(3, 4, 2, 3, 2, 1, 2), 3))
  }
}

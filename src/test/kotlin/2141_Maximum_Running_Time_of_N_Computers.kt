import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumRunningTimeOfNComputers2141Test {

  @Test
  fun example1() {
    assertEquals(4, maxRunTime(2, intArrayOf(3, 3, 3)))
  }

  @Test
  fun example2() {
    assertEquals(2, maxRunTime(2, intArrayOf(1, 1, 1, 1)))
  }

  @Test
  fun example3() {
    assertEquals(8, maxRunTime(3, intArrayOf(3, 5, 10, 10)))
  }
}

import kotlin.test.Test
import kotlin.test.assertEquals

class CoinChangeII518Test {

  @Test
  fun example1() {
    assertEquals(2, change(100, intArrayOf(99, 1)))
  }

  @Test
  fun example2() {
    assertEquals(4, change(5, intArrayOf(1, 2, 5)))
  }

  @Test
  fun example3() {
    assertEquals(0, change(3, intArrayOf(2)))
  }

  @Test
  fun example4() {
    assertEquals(1, change(10, intArrayOf(10)))
  }
}

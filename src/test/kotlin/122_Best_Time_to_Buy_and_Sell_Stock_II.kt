import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStock122Test {

  @Test
  fun example1() {
    assertEquals(7, maxProfitII(intArrayOf(7, 1, 5, 3, 6, 4)))
  }

  @Test
  fun example2() {
    assertEquals(4, maxProfitII(intArrayOf(1, 2, 3, 4, 5)))
  }

  @Test
  fun example3() {
    assertEquals(0, maxProfitII(intArrayOf(7, 6, 4, 3, 1)))
  }

  @Test
  fun example4() {
    assertEquals(10, maxProfitII(intArrayOf(10, 5, 0, 10)))
  }

  @Test
  fun example5() {
    assertEquals(5, maxProfitII(intArrayOf(0, 5, 5, 0)))
  }

  @Test
  fun example6() {
    assertEquals(5, maxProfitII(intArrayOf(5, 10, 10, 5, 5, 5, 0)))
  }
}

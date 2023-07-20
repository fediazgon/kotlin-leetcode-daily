import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStock121 {

  @Test
  fun example1() {
    assertEquals(5, maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
  }

  @Test
  fun example2() {
    assertEquals(0, maxProfit(intArrayOf(7, 6, 4, 3, 1)))
  }

  @Test
  fun example3() {
    assertEquals(1, maxProfit(intArrayOf(7, 6, 4, 3, 4)))
  }

  @Test
  fun example4() {
    assertEquals(0, maxProfit(intArrayOf(7)))
  }

  @Test
  fun example5() {
    assertEquals(2, maxProfit(intArrayOf(2, 1, 2, 1, 0, 1, 2)))
  }

  @Test
  fun example6() {
    assertEquals(15, maxProfit(intArrayOf(15, 20, 0, 15)))
  }
}

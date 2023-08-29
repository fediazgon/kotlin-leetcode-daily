import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumPenaltyForAShop2483Test {

  @Test
  fun example1() {
    assertEquals(2, bestClosingTime("YYNY"))
  }

  @Test
  fun example2() {
    assertEquals(0, bestClosingTime("NNNNN"))
  }

  @Test
  fun example3() {
    assertEquals(4, bestClosingTime("YYYY"))
  }
}

import kotlin.test.Test
import kotlin.test.assertEquals

class Pow50Test {

  @Test
  fun example1() {
    assertEquals(1024.0, myPow(2.0, 10), 10E-8)
  }

  @Test
  fun example2() {
    assertEquals(9.261, myPow(2.1, 3), 10E-8)
  }

  @Test
  fun example3() {
    assertEquals(0.25, myPow(2.0, -2), 10E-8)
  }

  @Test
  fun example4() {
    assertEquals(1.0, myPow(1.0, Integer.MAX_VALUE), 10E-8)
  }

  @Test
  fun example5() {
    assertEquals(1.0, myPow(1.0, Integer.MIN_VALUE), 10E-8)
  }
}

import kotlin.test.Test
import kotlin.test.assertEquals

class SoupServing808Test {

  @Test
  fun example1() {
    assertEquals(0.6250, soupServings(50))
  }

  @Test
  fun example2() {
    assertEquals(0.71875, soupServings(100))
  }

  @Test
  fun example3() {
    assertEquals(1.0, soupServings(1_000_000_000), 10E-5)
  }

  @Test
  fun example4() {
    assertEquals(0.99975, soupServings(3000), 10E-5)
  }

  @Test
  fun example5() {
    assertEquals(0.62500, soupServings(1), 10E-5)
  }

  @Test
  fun example6() {
    assertEquals(0.62500, soupServings(49), 10E-5)
  }

  @Test
  fun example7() {
    assertEquals(0.62500, soupServings(50), 10E-5)
  }

  @Test
  fun example8() {
    assertEquals(0.65625, soupServings(51), 10E-5)
  }
}

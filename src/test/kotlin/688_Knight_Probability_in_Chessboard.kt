import kotlin.test.Test
import kotlin.test.assertEquals

class KnightProbabilityInChessboard688Test {

  @Test
  fun example1() {
    assertEquals(0.06250, knightProbability(3, 2, 0, 0), 5e-6)
  }

  @Test
  fun example2() {
    assertEquals(1.0, knightProbability(1, 0, 0, 0), 5e-6)
  }

  @Test
  fun example3() {
    assertEquals(0.1875, knightProbability(5, 2, 0, 0), 5e-6)
  }

  @Test
  fun example4() {
    assertEquals(0.0, knightProbability(1, 2, 0, 0), 5e-6)
  }

  @Test
  fun example5() {
    assertEquals(0.04743, knightProbability(25, 100, 12, 12), 5e-6)
  }
}

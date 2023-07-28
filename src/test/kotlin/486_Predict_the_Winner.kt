import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PredictTheWinner486Test {

  @Test
  fun example1() {
    assertFalse { predictTheWinner(intArrayOf(1, 5, 2)) }
  }

  @Test
  fun example2() {
    assertTrue { predictTheWinner(intArrayOf(1, 5, 233, 7)) }
  }
}

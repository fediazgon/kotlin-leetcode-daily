import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class JumpGame55test {

  @Test
  fun example1() {
    assertTrue { canJump(intArrayOf(2, 3, 1, 1, 4)) }
  }

  @Test
  fun example2() {
    assertFalse { canJump(intArrayOf(3, 2, 1, 0, 4)) }
  }

  @Test
  fun example3() {
    assertTrue { canJump(intArrayOf(10)) }
  }
}

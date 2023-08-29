import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class InterleavingString97Test {

  @Test
  fun example1() {
    assertTrue { isInterleave("aabcc", "dbbca", "aadbbcbcac") }
  }

  @Test
  fun example2() {
    assertFalse { isInterleave("aabcc", "dbbca", "aadbbbaccc") }
  }

  @Test
  fun example3() {
    assertTrue { isInterleave("aaa", "", "aaa") }
  }

  @Test
  fun example4() {
    assertTrue { isInterleave("", "", "") }
  }
}

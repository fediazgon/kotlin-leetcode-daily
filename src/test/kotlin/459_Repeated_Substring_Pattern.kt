import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class RepeatedSubstringPattern459Test {

  @Test
  fun example1() {
    assertTrue { repeatedSubstringPattern("abab") }
  }

  @Test
  fun example2() {
    assertTrue { repeatedSubstringPattern("abcabcabcabc") }
  }

  @Test
  fun example3() {
    assertFalse { repeatedSubstringPattern("abcdabcdefgefg") }
  }

  @Test
  fun example4() {
    assertTrue { repeatedSubstringPattern("abacababacab") }
  }
}

import kotlin.test.Test
import kotlin.test.assertEquals

class ExtraCharactersInAString2707Test {

  @Test
  fun example1() {
    assertEquals(1, minExtraChar("leetscode", arrayOf("leet", "code", "leetcode")))
  }

  @Test
  fun example2() {
    assertEquals(3, minExtraChar("sayhelloworld", arrayOf("hello", "world")))
  }

  @Test
  fun example3() {
    assertEquals(0, minExtraChar("helloworldhello", arrayOf("hello", "world")))
  }
}

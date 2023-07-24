import kotlin.test.Test
import kotlin.test.assertEquals

class LongestSubstringWithoutRepeatingCharacters3Test {

  @Test
  fun example1() {
    assertEquals(3, lengthOfLongestSubstring("abcabcbb"))
  }

  @Test
  fun example2() {
    assertEquals(1, lengthOfLongestSubstring("bbbbb"))
  }

  @Test
  fun example3() {
    assertEquals(3, lengthOfLongestSubstring("pwwkew"))
  }

  @Test
  fun example4() {
    assertEquals(3, lengthOfLongestSubstring("dvdf"))
  }

  @Test
  fun example5() {
    assertEquals(1, lengthOfLongestSubstring("    "))
  }
}

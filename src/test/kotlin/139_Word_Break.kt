import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WordBreak139Test {

  @Test
  fun example1() {
    assertTrue(wordBreak("leetcode", listOf("leet", "code")))
  }

  @Test
  fun example2() {
    assertTrue(wordBreak("applepenapple", listOf("apple", "pen")))
  }

  @Test
  fun example3() {
    assertFalse(wordBreak("catsandogs", listOf("cats", "dog", "sand", "and", "cat")))
  }

  @Test
  fun example4() {
    assertFalse(
        wordBreak(
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
            listOf(
                "a",
                "aa",
                "aaa",
                "aaaa",
                "aaaaa",
                "aaaaaa",
                "aaaaaaa",
                "aaaaaaaa",
                "aaaaaaaaa",
                "aaaaaaaaaa")))
  }
}

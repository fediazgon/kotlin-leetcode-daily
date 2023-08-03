import kotlin.test.Test
import kotlin.test.assertContentEquals

class LetterCombinationsOfAPhoneNumber17Test {

  @Test
  fun example1() {
    assertContentEquals(
        listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), letterCombinations("23"))
  }

  @Test
  fun example2() {
    assertContentEquals(listOf(), letterCombinations(""))
  }

  @Test
  fun example3() {
    assertContentEquals(listOf("a", "b", "c"), letterCombinations("2"))
  }
}

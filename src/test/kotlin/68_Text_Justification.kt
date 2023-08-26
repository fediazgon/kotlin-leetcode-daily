import kotlin.test.Test
import kotlin.test.assertContentEquals

class TextJustification68Test {

  @Test
  fun example1() {
    assertContentEquals(
        listOf("This    is    an", "example  of text", "justification.  "),
        fullJustify(
            arrayOf("This", "is", "an", "example", "of", "text", "justification."), maxWidth = 16))
  }

  @Test
  fun example2() {
    assertContentEquals(
        listOf("What   must   be", "acknowledgment  ", "shall be        "),
        fullJustify(arrayOf("What", "must", "be", "acknowledgment", "shall", "be"), maxWidth = 16))
  }

  @Test
  fun example3() {
    assertContentEquals(
        listOf(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "),
        fullJustify(
            arrayOf(
                "Science",
                "is",
                "what",
                "we",
                "understand",
                "well",
                "enough",
                "to",
                "explain",
                "to",
                "a",
                "computer.",
                "Art",
                "is",
                "everything",
                "else",
                "we",
                "do"),
            maxWidth = 20))
  }

  @Test
  fun example4() {
    assertContentEquals(
        listOf("Hello", "World"), fullJustify(arrayOf("Hello", "World"), maxWidth = 5))
  }

  @Test
  fun example5() {
    assertContentEquals(
        listOf("123456789123", "1  2  3  4 5", "123456789123"),
        fullJustify(
            arrayOf("123456789123", "1", "2", "3", "4", "5", "123456789123"), maxWidth = 12))
  }
}

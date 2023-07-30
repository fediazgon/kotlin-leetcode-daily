import kotlin.test.Test
import kotlin.test.assertEquals

class StrangePrinter664Test {

  @Test
  fun example1() {
    assertEquals(2, strangePrinter("aaabbb"))
  }

  @Test
  fun example2() {
    assertEquals(2, strangePrinter("aba"))
  }

  @Test
  fun example3() {
    assertEquals(5, strangePrinter("ddeeccaabbaaccdd"))
  }

  @Test
  fun example4() {
    assertEquals(3, strangePrinter("bbbaaabbbaaabbb"))
  }

  @Test
  fun example5() {
    assertEquals(101, strangePrinter(('a'..'z').joinToString(separator = "").repeat(4)))
  }
}

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumASCIIDeleteSumForTwoStrings712Test {

  @Test
  fun example1() {
    assertEquals(231, minimumDeleteSum("sea", "eat"))
  }

  @Test
  fun example2() {
    assertEquals(403, minimumDeleteSum("delete", "leet"))
  }

  @Test
  fun example3() {
    assertEquals(922, minimumDeleteSum("leeecooodee", "leecccodddde"))
  }

  @Test
  fun example4() {
    val s = ('a'..'z').joinToString(separator="").repeat(40)
    assertEquals(208562, minimumDeleteSum(s, s.reversed()))
  }
}

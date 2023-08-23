import kotlin.test.Test
import kotlin.test.assertEquals

class ReorganizeString767Test {

  @Test
  fun example1() {
    assertEquals("aba", reorganizeString("aab"))
  }

  @Test
  fun example2() {
    assertEquals("", reorganizeString("aaab"))
  }

  @Test
  fun example3() {
    assertEquals("ababacac", reorganizeString("aaaabbcc"))
  }
}

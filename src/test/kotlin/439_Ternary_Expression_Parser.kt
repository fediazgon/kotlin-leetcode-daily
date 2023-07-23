import kotlin.test.Test
import kotlin.test.assertEquals

class TernaryExpressionParser439Test {

  @Test
  fun example1() {
    assertEquals("2", parseTernary("T?2:3"))
  }

  @Test
  fun example2() {
    assertEquals("4", parseTernary("F?1:T?4:5"))
  }

  @Test
  fun example3() {
    assertEquals("F", parseTernary("T?T?F:5:3"))
  }

  @Test
  fun example4() {
    assertEquals("F", parseTernary("F?F?3:8:T?F:T?0:F?8:T"))
  }
}

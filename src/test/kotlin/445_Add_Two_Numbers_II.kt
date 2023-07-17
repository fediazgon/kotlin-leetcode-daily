import kotlin.test.Test
import kotlin.test.assertEquals
import model.listNodeOf

class AddTwoNumbersII445Test {

  @Test
  fun example1() {
    assertEquals(listNodeOf(7, 8, 0, 7), addTwoNumbers(listNodeOf(7, 2, 4, 3), listNodeOf(5, 6, 4)))
  }

  @Test
  fun example2() {
    assertEquals(listNodeOf(8, 0, 7), addTwoNumbers(listNodeOf(2, 4, 3), listNodeOf(5, 6, 4)))
  }

  @Test
  fun example3() {
    assertEquals(listNodeOf(0), addTwoNumbers(listNodeOf(0), listNodeOf(0)))
  }
}

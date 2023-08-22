import kotlin.test.Test
import kotlin.test.assertEquals

class ExcelSheetColumnTitle168Test {

  @Test
  fun example1() {
    assertEquals("A", convertToTitle(1))
  }

  @Test
  fun example2() {
    assertEquals("AB", convertToTitle(28))
  }

  @Test
  fun example3() {
    assertEquals("ZY", convertToTitle(701))
  }

  @Test
  fun example4() {
    assertEquals("ZZ", convertToTitle(702))
  }
}

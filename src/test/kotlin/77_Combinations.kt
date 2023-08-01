import kotlin.test.Test
import kotlin.test.assertContentEquals

class Combinations77Test {

  @Test
  fun example1() {
    assertContentEquals(
        listOf(listOf(1, 2), listOf(1, 3), listOf(1, 4), listOf(2, 3), listOf(2, 4), listOf(3, 4)),
        combine(4, 2))
  }

  @Test
  fun example2() {
    assertContentEquals(listOf(listOf(1)), combine(1, 1))
  }
}

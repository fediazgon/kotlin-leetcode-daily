import kotlin.test.Test
import kotlin.test.assertContentEquals

class Permutations46Test {

  @Test
  fun example1() {
    assertContentEquals(
      listOf(
        listOf(1, 2, 3),
        listOf(1, 3, 2),
        listOf(2, 1, 3),
        listOf(2, 3, 1),
        listOf(3, 1, 2),
        listOf(3, 2, 1)
      ),
      permute(intArrayOf(1, 2, 3))
    )
  }

  @Test
  fun example2() {
    assertContentEquals(listOf(listOf(1)), permute(intArrayOf(1)))
  }
}

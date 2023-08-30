import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumReplacementsToSortTheArray2366Test {

  @Test
  fun example1() {
    assertEquals(2, minimumReplacement(intArrayOf(9, 3, 9)))
  }

  @Test
  fun example2() {
    assertEquals(0, minimumReplacement(intArrayOf(1, 2, 3, 4, 5)))
  }
}

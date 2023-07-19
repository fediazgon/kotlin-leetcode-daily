import kotlin.test.Test
import kotlin.test.assertContentEquals

class RotateArray189 {

  @Test
  fun example1() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    rotate(arr, 3)
    assertContentEquals(intArrayOf(5, 6, 7, 1, 2, 3, 4), arr)
  }

  @Test
  fun example2() {
    val arr = intArrayOf(-1, -100, 3, 99)
    rotate(arr, 2)
    assertContentEquals(intArrayOf(3, 99, -1, -100), arr)
  }
}

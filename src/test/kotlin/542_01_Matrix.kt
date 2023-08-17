import kotlin.test.Test
import kotlin.test.assertTrue

class ZeroOneMatrix542Test {

  @Test
  fun example1() {
    assertTrue(
        arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 2, 1))
            .contentDeepEquals(
                updateMatrix(
                    arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1)))))
  }

  @Test
  fun example2() {
    assertTrue(
        arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))
            .contentDeepEquals(
                updateMatrix(
                    arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0)))))
  }

  @Test
  fun example3() {
    assertTrue(
        arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 2, 1), intArrayOf(2, 3, 2))
            .contentDeepEquals(
                updateMatrix(
                    arrayOf(
                        intArrayOf(0, 0, 0),
                        intArrayOf(0, 1, 0),
                        intArrayOf(1, 1, 1),
                        intArrayOf(1, 1, 1)))))
  }
}

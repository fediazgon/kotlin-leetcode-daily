import kotlin.test.Test
import kotlin.test.assertContentEquals

class AsteroidCollision735 {

  @Test
  fun example1() {
    assertContentEquals(intArrayOf(5, 10), asteroidCollision(intArrayOf(5, 10, -5)))
  }

  @Test
  fun example2() {
    assertContentEquals(intArrayOf(), asteroidCollision(intArrayOf(8, -8)))
  }

  @Test
  fun example3() {
    assertContentEquals(intArrayOf(10), asteroidCollision(intArrayOf(10, 2, -5)))
  }

  @Test
  fun example4() {
    assertContentEquals(intArrayOf(), asteroidCollision(intArrayOf(6, 5, 1, 2, 3, 4, -5, -6)))
  }

  @Test
  fun example5() {
    assertContentEquals(intArrayOf(-6, -5, -1, -2, -3, -4, 5, 6), asteroidCollision(intArrayOf(-6, -5, -1, -2, -3, -4, 5, 6)))
  }
}

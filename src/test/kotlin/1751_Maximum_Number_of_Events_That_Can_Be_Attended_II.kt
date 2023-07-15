import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfEventThatCanBeAttendedII1751Test {

  @Test
  fun example1() {
    assertEquals(
        7,
        MaximumNumberOfEventThatCanBeAttendedII1751.maxValueBottomUp(
            arrayOf(intArrayOf(1, 2, 4), intArrayOf(3, 4, 3), intArrayOf(2, 3, 1)), 2))
  }

  @Test
  fun example2() {
    assertEquals(
        10,
        MaximumNumberOfEventThatCanBeAttendedII1751.maxValueBottomUp(
            arrayOf(intArrayOf(1, 2, 4), intArrayOf(3, 4, 3), intArrayOf(2, 3, 10)), 2))
  }

  @Test
  fun example3() {
    assertEquals(
        9,
        MaximumNumberOfEventThatCanBeAttendedII1751.maxValueBottomUp(
            arrayOf(
                intArrayOf(1, 1, 1), intArrayOf(2, 2, 2), intArrayOf(3, 3, 3), intArrayOf(4, 4, 4)),
            3))
  }
}

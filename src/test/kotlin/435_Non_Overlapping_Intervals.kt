import kotlin.test.Test
import kotlin.test.assertEquals

class NonOverlappingIntervals435 {

  @Test
  fun example1() {
    assertEquals(
      1,
      eraseOverlapIntervals(
        arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 3))
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      2,
      eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 2)))
    )
  }

  @Test
  fun example3() {
    assertEquals(0, eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))))
  }

  @Test
  fun example4() {
    assertEquals(0, eraseOverlapIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))))
  }

  @Test
  fun example5() {
    assertEquals(
      2,
      eraseOverlapIntervals(
        arrayOf(
          intArrayOf(0, 2),
          intArrayOf(1, 3),
          intArrayOf(2, 4),
          intArrayOf(3, 5),
          intArrayOf(4, 6)
        )
      )
    )
  }

  @Test
  fun example6() {
    assertEquals(
      1,
      eraseOverlapIntervals(
        arrayOf(
          intArrayOf(0, 10),
          intArrayOf(1, 2),
          intArrayOf(2, 3),
          intArrayOf(3, 4),
          intArrayOf(4, 5)
        )
      )
    )
  }
}

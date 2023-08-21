import kotlin.test.Test
import kotlin.test.assertContentEquals

class SortItemsByGroupsRespectingDependencies1203Test {

  @Test
  fun example1() {
    assertContentEquals(
        intArrayOf(6, 3, 4, 5, 2, 0, 7, 1),
        sortItems(
            8,
            2,
            intArrayOf(-1, -1, 1, 0, 0, 1, 0, -1),
            listOf(
                listOf(),
                listOf(6),
                listOf(5),
                listOf(6),
                listOf(3, 6),
                listOf(),
                listOf(),
                listOf())))
  }

  @Test
  fun example2() {
    assertContentEquals(
        intArrayOf(),
        sortItems(
            8,
            2,
            intArrayOf(-1, -1, 1, 0, 0, 1, 0, -1),
            listOf(
                listOf(),
                listOf(6),
                listOf(5),
                listOf(6),
                listOf(3),
                listOf(),
                listOf(4),
                listOf())))
  }
}

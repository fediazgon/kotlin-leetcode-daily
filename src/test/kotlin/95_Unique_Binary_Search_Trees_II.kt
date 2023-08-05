import kotlin.test.Test
import kotlin.test.assertEquals
import model.treeFromLevelOrder

class UniqueBinarySearchTreesII95Test {

  @Test
  fun example1() {
    assertEquals(
        listOf(
            treeFromLevelOrder(arrayOf(1, null, 2, null, 3)),
            treeFromLevelOrder(arrayOf(1, null, 3, 2)),
            treeFromLevelOrder(arrayOf(2, 1, 3)),
            treeFromLevelOrder(arrayOf(3, 1, null, null, 2)),
            treeFromLevelOrder(arrayOf(3, 2, null, 1))),
        generateTrees(3))
  }

  @Test
  fun example2() {
    assertEquals(listOf(treeFromLevelOrder(arrayOf(1))), generateTrees(1))
  }
}

import java.time.Duration
import kotlin.test.Test
import kotlin.test.assertContentEquals
import model.treeFromLevelOrder
import org.junit.jupiter.api.assertTimeout

class AllPossibleFullBinaryTrees894Test {

  @Test
  fun example1() {
    assertContentEquals(
        listOf(
            treeFromLevelOrder(arrayOf(0, 0, 0, null, null, 0, 0, null, null, 0, 0)),
            treeFromLevelOrder(arrayOf(0, 0, 0, null, null, 0, 0, 0, 0)),
            treeFromLevelOrder(arrayOf(0, 0, 0, 0, 0, 0, 0)),
            treeFromLevelOrder(arrayOf(0, 0, 0, 0, 0, null, null, null, null, 0, 0)),
            treeFromLevelOrder(arrayOf(0, 0, 0, 0, 0, null, null, 0, 0))),
        allPossibleFBT(7))
  }

  @Test
  fun example2() {
    assertTimeout(Duration.ofSeconds(1)) { allPossibleFBT(19) }
  }
}

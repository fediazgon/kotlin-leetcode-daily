package model

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class TreeNodeTest {

  @Test
  fun shouldParseLevelOrderTraversal() {
    val root = treeFromLevelOrder(arrayOf(1, 2, 3, null, null, 4, 5, null, null, 6, 7))!!

    assertEquals(1, root.`val`)

    var left = root.left!!
    assertEquals(2, left.`val`)
    assertNull(left.left)
    assertNull(left.right)
    var right = root.right!!
    assertEquals(3, right.`val`)

    left = right.left!!
    assertEquals(4, left.`val`)
    assertNull(left.left)
    assertNull(left.right)
    right = right.right!!
    assertEquals(5, right.`val`)

    left = right.left!!
    assertEquals(6, left.`val`)
    assertNull(left.left)
    assertNull(left.right)
    right = right.right!!
    assertEquals(7, right.`val`)
    assertNull(right.left)
    assertNull(right.right)
  }

  @Test
  fun shouldToStringAccordingToLevelOrderTraversal() {
    assertEquals(
        "[1, 2, 3, null, null, 4, 5, null, null, 6, 7]",
        treeFromLevelOrder(arrayOf(1, 2, 3, null, null, 4, 5, null, null, 6, 7))!!.toString())
  }
}

import kotlin.test.Test
import kotlin.test.assertContentEquals

class RemoveElement27Test {

  @Test
  fun example1() {
    val nums1 = intArrayOf(3, 2, 2, 3)
    val n = removeElement(nums1, 3)
    assertContentEquals(intArrayOf(2, 2), nums1.sliceArray(0 until n).sortedArray())
  }

  @Test
  fun example2() {
    val nums1 = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
    val n = removeElement(nums1, 2)
    assertContentEquals(intArrayOf(0, 0, 1, 3, 4), nums1.sliceArray(0 until n).sortedArray())
  }
}

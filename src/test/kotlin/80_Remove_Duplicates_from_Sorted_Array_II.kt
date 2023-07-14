import java.util.*
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

internal class RemoveDuplicatesFromSortedArrayII80Test {

  @Test
  fun example1() {
    val nums1 = intArrayOf(1, 1, 1, 2, 2, 3)
    val n = RemoveDuplicatesFromSortedArrayII80.removeDuplicates(nums1)
    assertContentEquals(intArrayOf(1, 1, 2, 2, 3), nums1.sliceArray(0 until n))
  }

  @Test
  fun example2() {
    val nums1 = intArrayOf(0,0,1,1,1,1,2,3,3)
    val n = RemoveDuplicatesFromSortedArrayII80.removeDuplicates(nums1)
    assertContentEquals(intArrayOf(0,0,1,1,2,3,3), nums1.sliceArray(0 until n))
  }

  @Test
  fun example3() {
    val nums1 = intArrayOf(0,0,0,0,1,1,1,1,2,3,3,4,4,4)
    val n = RemoveDuplicatesFromSortedArrayII80.removeDuplicates(nums1)
    assertContentEquals(intArrayOf(0,0,1,1,2,3,3,4,4), nums1.sliceArray(0 until n))
  }
}

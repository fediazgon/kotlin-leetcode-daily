import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals


internal class MergeSortedArray88Test {

    @Test
    fun example1() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        MergeSortedArray88.merge(
            nums1, 3, intArrayOf(2, 5, 6), 3
        )
        assertContentEquals(
            intArrayOf(1, 2, 2, 3, 5, 6), nums1
        )
    }

    @Test
    fun example2() {
        val nums1 = intArrayOf(1)
        MergeSortedArray88.merge(
            nums1, 1, intArrayOf(), 0
        )
        assertContentEquals(
            intArrayOf(1), nums1
        )
    }

    @Test
    fun example3() {
        val nums1 = intArrayOf(0)
        MergeSortedArray88.merge(
            nums1, 0, intArrayOf(1), 1
        )
        assertContentEquals(
            intArrayOf(1), nums1
        )
    }

}


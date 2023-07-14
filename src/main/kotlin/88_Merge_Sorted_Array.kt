class MergeSortedArray88 {

  companion object {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
      var insertIdx = nums1.size - 1
      var i = m - 1
      var j = n - 1
      while (j >= 0) {
        if (i >= 0) {
          nums1[insertIdx--] = if (nums1[i] > nums2[j]) nums1[i--] else nums2[j--]
        } else {
          nums1[insertIdx--] = nums2[j--]
        }
      }
    }
  }
}

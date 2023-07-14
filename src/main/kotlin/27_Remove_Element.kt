class RemoveElement27 {

  companion object {

    fun removeElement(nums: IntArray, v: Int): Int {
      var insertIdx = 0
      for (n in nums) {
        if (n != v) nums[insertIdx++] = n
      }
      return insertIdx
    }
  }
}

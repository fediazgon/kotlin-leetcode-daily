fun rotate(nums: IntArray, k: Int): Unit {
  var remainingSwaps = nums.size
  loop@ for (startIdx in nums.indices) {
    var currIdx = startIdx
    var currVal = nums[currIdx]
    do {
      val nextIdx = (currIdx + k) % nums.size
      val tmp = nums[nextIdx]
      nums[nextIdx] = currVal
      currVal = tmp
      currIdx = nextIdx
      remainingSwaps--
      if (remainingSwaps == 0) break@loop
    } while (currIdx != startIdx)
  }
}

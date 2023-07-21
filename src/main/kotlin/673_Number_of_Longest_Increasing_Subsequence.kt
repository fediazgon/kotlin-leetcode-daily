// TODO: do top-down
fun findNumberOfLIS(nums: IntArray): Int {
  if (nums.size < 2) return nums.size
  val maxLen = IntArray(nums.size) { 0 }
  val maxNum = IntArray(nums.size) { 0 }
  maxLen[nums.lastIndex] = 1
  maxNum[nums.lastIndex] = 1
  findNumberOfLIS(nums, pos = 0, maxLen = maxLen, maxNum = maxNum)
  val max = maxLen.max()
  return maxLen.withIndex().filter { it.value == max }.map { maxNum[it.index] }.sum()
}

private fun findNumberOfLIS(nums: IntArray, pos: Int, maxLen: IntArray, maxNum: IntArray): Int {
  if (maxLen[pos] != 0) return maxLen[pos]
  val curr = nums[pos]
  val lengths =
      (pos + 1 until nums.size)
          .map { findNumberOfLIS(nums, it, maxLen, maxNum) to nums[it] }
          .map { if (it.second > curr) it.first + 1 else 1 }
  val max = lengths.max()
  maxLen[pos] = max
  if (max == 1) {
    maxNum[pos] += 1
  } else {
    for ((i, l) in lengths.withIndex()) {
      if (l != 1 && l == max) {
        maxNum[pos] += maxNum[pos + i + 1]
      }
    }
  }
  return max
}

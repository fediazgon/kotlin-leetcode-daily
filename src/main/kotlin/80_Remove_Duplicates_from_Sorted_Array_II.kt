fun removeDuplicates(nums: IntArray): Int {
  if (nums.size < 3) {
    return nums.size
  }
  var prev = nums[0]
  var count = 1
  var insertIdx = 1
  for (n in nums.drop(1)) {
    if (n != prev || count < 2) {
      nums[insertIdx++] = n
      count = if (n != prev) 1 else count + 1
      prev = n
    }
  }
  return insertIdx
}

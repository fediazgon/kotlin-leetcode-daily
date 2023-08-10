fun searchII(nums: IntArray, target: Int): Boolean {
  var lo = 0
  var hi = nums.size - 1
  while (lo < hi && nums[lo] == nums[lo + 1]) ++lo
  while (lo < hi && nums[hi] == nums[hi - 1]) --hi
  while (lo <= hi) {
    val mid = lo + (hi - lo) / 2
    val v = nums[mid]
    if (v < nums[hi]) {
      // Ascending from mid to hi
      if (target == v) {
        return true
      } else if (target > v && target <= nums[hi]) {
        lo = mid + 1
      } else {
        hi = mid - 1
      }
    } else {
      // Ascending from lo to mid
      if (target == v) {
        return true
      } else if (target < v && target >= nums[lo]) {
        hi = mid - 1
      } else {
        lo = mid + 1
      }
    }
  }
  return false
}

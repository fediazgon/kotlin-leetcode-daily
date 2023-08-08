// 1 2 3 4 5 6
// 6 1 2 3 4 5
// 5 6 1 2 3 4
// 4 5 6 1 2 3
// 3 4 5 6 1 2
// 2 3 4 5 6 1

fun search(nums: IntArray, target: Int): Int {
  var lo = 0
  var hi = nums.size - 1
  while (lo <= hi) {
    val mid = lo + (hi - lo) / 2
    val v = nums[mid]
    if (v < nums[hi]) {
      // Ascending from mid to hi
      if (target == v) {
        return mid
      } else if (target > v && target <= nums[hi]) {
        lo = mid + 1
      } else {
        hi = mid - 1
      }
    } else {
      // Ascending from lo to mid
      if (target == v) {
        return mid
      } else if (target < v && target >= nums[lo]) {
        hi = mid - 1
      } else {
        lo = mid + 1
      }
    }
  }
  return -1
}

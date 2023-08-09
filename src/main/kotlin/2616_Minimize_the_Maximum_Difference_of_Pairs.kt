fun minimizeMax(nums: IntArray, p: Int): Int {
  var lo = 0
  var hi = Integer.MAX_VALUE - 1
  var sol = 0
  nums.sort()
  search@ while (lo <= hi) {
    var count = 0
    val threshold = lo + (hi - lo) / 2
    var i = 0
    while (i < nums.size - 1) {
      if (nums[i + 1] - nums[i] <= threshold) {
        count++
        if (count == p) {
          sol = threshold
          hi = threshold - 1
          continue@search
        }
        i += 2
      } else {
        i += 1
      }
    }
    lo = threshold + 1
  }
  return sol
}

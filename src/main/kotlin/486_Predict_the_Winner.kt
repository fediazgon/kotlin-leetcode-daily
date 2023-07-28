fun predictTheWinner(nums: IntArray): Boolean {
  return topDownPredictTheWinner(nums)
}

private fun topDownPredictTheWinner(nums: IntArray): Boolean {
  val dp = Array(nums.size) { IntArray(nums.size) { -1 } }
  return topDownMaxDiffScore(nums, 0, nums.lastIndex, dp) >= 0
}

private fun topDownMaxDiffScore(nums: IntArray, l: Int, r: Int, dp: Array<IntArray>): Int {
  if (l == r) {
    return nums[l]
  }
  if (dp[l][r] != -1) {
    return dp[l][r]
  }
  val pointsLeft = nums[l] - topDownMaxDiffScore(nums, l + 1, r, dp)
  val pointsRight = nums[r] - topDownMaxDiffScore(nums, l, r - 1, dp)
  dp[l][r] = maxOf(pointsLeft, pointsRight)
  return dp[l][r]
}

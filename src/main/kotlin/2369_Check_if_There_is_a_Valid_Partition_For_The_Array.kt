fun validPartition(nums: IntArray): Boolean = validPartitionTopDown(nums)

fun validPartitionTopDown(nums: IntArray): Boolean {
  val dp = IntArray(nums.size + 1) { -1 }
  dp[0] = 1
  fun valid(i: Int): Boolean {
    if (dp[i] != -1) {
      return dp[i] == 1
    }
    dp[i] =
        if ((i - 2 >= 0 && nums[i - 1] == nums[i - 2] && valid(i - 2)) ||
            (i - 3 >= 0 &&
                nums[i - 1] == nums[i - 2] &&
                nums[i - 2] == nums[i - 3] &&
                valid(i - 3)) ||
            (i - 3 >= 0 &&
                nums[i - 1] == nums[i - 2] + 1 &&
                nums[i - 2] == nums[i - 3] + 1 &&
                valid(i - 3)))
            1
        else 0
    return dp[i] == 1
  }
  return valid(nums.size)
}

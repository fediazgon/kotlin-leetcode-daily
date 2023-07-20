enum class State {
  UNKNOWN,
  GOOD,
  BAD
}

fun canJump(nums: IntArray): Boolean {
  val memo = Array(nums.size) { State.UNKNOWN }
  memo[memo.lastIndex] = State.GOOD
  return canJump(nums, 0, memo)
}

private fun canJump(nums: IntArray, pos: Int, memo: Array<State>): Boolean {
  if (memo[pos] != State.UNKNOWN) return memo[pos] == State.GOOD
  val jumpDis = nums[pos]
  val maxJumpDis = minOf(jumpDis, nums.size - pos - 1)
  for (jump in 1..maxJumpDis) {
    canJump(nums, pos + jump, memo).also {
      memo[pos] =
          if (it)
              State.GOOD.also {
                return true
              }
          else State.BAD
    }
  }
  return false
}

import kotlin.math.ceil

fun minimumReplacement(nums: IntArray): Long {
  var answer = 0L
  val n = nums.size
  var next = nums[n - 1].toLong()
  for (i in n - 2 downTo 0) {
    val curr = nums[i].toLong()
    if (curr > next) {
      val nElements = ceil(curr / next.toDouble()).toLong()
      answer += nElements - 1
      next = curr / nElements
    } else {
      next = curr
    }
  }
  return answer
}

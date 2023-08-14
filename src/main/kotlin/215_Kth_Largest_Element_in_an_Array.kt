import java.util.*

fun findKthLargest(nums: IntArray, k: Int): Int {
  val q = PriorityQueue<Int>(k)
  for (n in nums) {
    if (q.size < k) {
      q.add(n)
    } else if (n > q.last() || n > q.first()) {
      q.remove()
      q.add(n)
    }
  }
  return q.first()
}

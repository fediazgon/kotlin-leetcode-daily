// Solution is OK, but it is TLE (Java works OK)
fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
  val res = IntArray(nums.size - k + 1) { -1 }
  val d = ArrayDeque<Int>(k)
  for (i in 0 until k) {
    while (!d.isEmpty() && nums[d.last()] < nums[i]) {
      d.removeLast()
    }
    d.addLast(i)
    res[0] = nums[d.first()]
  }
  for (i in k until nums.size) {
    if (i - k == d.first()) {
      d.removeFirst()
    }
    while (!d.isEmpty() && nums[d.last()] < nums[i]) {
      d.removeLast()
    }
    d.addLast(i)
    res[i - k + 1] = nums[d.first()]
    //        println("End iteration $i")
    //        println(
    //            "Window: ${
    //                nums.copyOfRange(maxOf(i - k + 1, 0), i + 1)
    //                    .joinToString(prefix = "[", separator = ", ", postfix = "]")
    //            }"
    //        )
    //        println("Deque: ${d.map { nums[it] }}")
    //        println("==========")
  }
  return res
}

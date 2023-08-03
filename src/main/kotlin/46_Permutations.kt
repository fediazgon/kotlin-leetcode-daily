fun permute(nums: IntArray): List<List<Int>> {
  val comb = mutableListOf<List<Int>>()
  permute(nums, LinkedHashSet(nums.size), comb)
  return comb
}

fun permute(nums: IntArray, curr: LinkedHashSet<Int>, comb: MutableList<List<Int>>) {
  if (curr.size == nums.size) {
    comb += curr.toList()
  }
  nums
      .filter { !curr.contains(it) }
      .forEach {
        curr.add(it)
        permute(nums, curr, comb)
        curr.remove(it)
      }
}

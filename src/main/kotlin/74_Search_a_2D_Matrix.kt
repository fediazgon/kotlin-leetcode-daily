fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
  var lo = 0
  var hi = matrix.size - 1
  while (lo <= hi) {
    val mid = lo + (hi - lo) / 2
    val arr = matrix[mid]
    if (target < arr.first()) {
      hi = mid - 1
    } else if (target > arr.last()) {
      lo = mid + 1
    } else {
      return searchSortedArray(arr, target)
    }
  }
  return false
}

private fun searchSortedArray(arr: IntArray, target: Int): Boolean {
  var lo = 0
  var hi = arr.size - 1
  while (lo <= hi) {
    val mid = lo + (hi - lo) / 2
    val v = arr[mid]
    if (target < v) {
      hi = mid - 1
    } else if (target > v) {
      lo = mid + 1
    } else {
      return true
    }
  }
  return false
}

fun peakIndexInMountainArray(arr: IntArray): Int {
  var lo = 0
  var hi = arr.size - 1
  while (lo <= hi) {
    val mid = lo + (hi - lo) / 2
    if (isPeak(arr, mid)) {
      return mid
    } else if (ascending(arr, mid)) {
      lo = mid + 1
    } else {
      hi = mid - 1
    }
  }
  return -1
}

private fun isPeak(arr: IntArray, idx: Int): Boolean =
    idx != 0 && idx != arr.size - 1 && arr[idx] > arr[idx - 1] && arr[idx] > arr[idx + 1]

private fun ascending(arr: IntArray, idx: Int): Boolean =
    idx == 0 || idx != arr.size - 1 && arr[idx] > arr[idx - 1] && arr[idx] < arr[idx + 1]

import kotlin.math.ceil

fun minSpeedOnTime(dist: IntArray, hour: Double): Int {
  if (dist.size - 1 >= hour) {
    return -1
  }
  var minSpeed = -1
  var lo = ceil(dist.sum() / hour).toInt()
  var hi: Int = maxOf(dist.max()!!, ceil(dist.last() / (hour - (dist.size - 1))).toInt())
  while (lo <= hi) {
    val speed = lo + (hi - lo) / 2
    if (onTime(dist, hour, speed)) {
      minSpeed = speed
      hi = speed - 1
    } else {
      lo = speed + 1
    }
  }
  return minSpeed
}

fun onTime(dist: IntArray, hour: Double, speed: Int): Boolean {
  return dist.dropLast(1).map { ceil(it / speed.toFloat()).toInt() }.sum().toDouble() +
      (dist.last().toDouble() / speed) <= hour
}

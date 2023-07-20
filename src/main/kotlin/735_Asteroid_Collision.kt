import kotlin.math.abs

fun asteroidCollision(asteroids: IntArray): IntArray {
  val s = ArrayDeque<Int>(asteroids.size)
  s.addLast(asteroids[0])
  asteroids@ for (i in 1 until asteroids.size) {
    val n = asteroids[i]
    while (!s.isEmpty() && s.last() > 0 && n < 0 && abs(s.last()) <= abs(n)) {
      val last = s.last()
      s.removeLast()
      if (abs(last) == abs(n)) {
        continue@asteroids
      }
    }
    if (s.isEmpty() || !(s.last() > 0 && n < 0)) {
      s.addLast(n)
    }
  }
  return s.toIntArray()
}

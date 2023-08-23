import kotlin.math.ceil

fun reorganizeString(s: String): String {
  val counts = mutableMapOf<Char, Int>()
  s.forEach { counts.merge(it, 1, Int::plus) }
  val chars = counts.keys.sortedByDescending { counts[it] }
  val maxCount = counts[chars[0]]!!
  if (maxCount > ceil(s.length / 2.0)) {
    return ""
  }
  val res = CharArray(s.length) { ' ' }
  var idx = 0
  for (c in chars) {
    while (counts.getValue(c) != 0) {
      res[idx] = c
      idx += 2
      counts.computeIfPresent(c) { _, v -> v - 1 }
      if (idx > s.length - 1) {
        idx = 1
      }
    }
  }
  return String(res)
}

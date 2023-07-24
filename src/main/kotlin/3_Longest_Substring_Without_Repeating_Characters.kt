fun lengthOfLongestSubstring(s: String): Int {
  if (s.length < 2) {
    return s.length
  }
  val lastIndex = mutableMapOf<Char, Int>().withDefault { -1 }
  var start = 0
  var longest = 0
  var currLength = 0
  for (i in s.indices) {
    val c = s[i]
    val lastIndexOfChar = lastIndex.getValue(c)
    if (lastIndexOfChar < start) {
      currLength++
      longest = maxOf(longest, currLength)
    } else {
      currLength = i - lastIndexOfChar
      start = lastIndexOfChar + 1
    }
    lastIndex[c] = i
  }
  return maxOf(longest, currLength)
}

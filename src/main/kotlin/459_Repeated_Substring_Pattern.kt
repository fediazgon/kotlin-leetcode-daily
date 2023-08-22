fun repeatedSubstringPattern(s: String): Boolean {
  val n = s.length
  val lps = IntArray(n) { 0 }
  var len = 0
  var idx = 1
  while (idx < lps.size) {
    if (s[len] == s[idx]) {
      len += 1
      lps[idx++] = len
    } else {
      if (len == 0) {
        lps[idx++] = 0
      } else {
        len = lps[len - 1]
      }
    }
  }
  val patternLen = n - lps[n - 1]
  return patternLen != n && n % patternLen == 0
}

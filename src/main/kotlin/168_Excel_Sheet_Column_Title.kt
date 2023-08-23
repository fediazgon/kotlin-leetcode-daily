fun convertToTitle(columnNumber: Int): String {
  var n = columnNumber
  val chars = mutableListOf<Char>()
  while (n != 0) {
    n -= 1
    val r = n % 26
    chars.add('A' + r)
    n /= 26
  }
  return String(chars.toCharArray().reversedArray())
}

// Notes: thing about starting at 1 in binary system:
// 0   -> 1 ((0 + 1) * 2^0)
// 1   -> 2 ((1 + 1) * 2^0)
// 00  -> 3 ((0 + 1) * 2^1 + (0 + 1) * 2^0)
// 01  -> 4 ((0 + 1) * 2^1 + (1 + 1) * 2^0)
// 10  -> 5 ((1 + 1) * 2^1 + (0 + 1) * 2^0)
// 11  -> 6 ((1 + 1) * 2^1 + (1 + 1) * 2^0)

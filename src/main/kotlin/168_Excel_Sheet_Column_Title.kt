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

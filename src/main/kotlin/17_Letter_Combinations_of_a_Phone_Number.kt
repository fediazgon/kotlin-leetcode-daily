val digitToLetters = arrayOf("abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "xwyz")

fun letterCombinations(digits: String): List<String> {
  if (digits.isEmpty()) {
    return emptyList()
  }
  val combs = mutableListOf<String>()
  val digitsN = digits.map { Character.digit(it, 10) }
  letterCombinations(digitsN, 0, CharArray(digits.length), combs)
  return combs
}

private fun letterCombinations(
    digits: List<Int>,
    idx: Int,
    curr: CharArray,
    combs: MutableList<String>
) {
  if (idx == digits.size) {
    combs += String(curr)
  } else {
    val letters = digitToLetters[digits[idx] - 2]
    for (l in letters) {
      curr[idx] = l
      letterCombinations(digits, idx + 1, curr, combs)
    }
  }
}

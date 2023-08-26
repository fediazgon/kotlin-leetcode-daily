fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
  var start = 0
  val lines = mutableListOf<String>()
  while (start < words.size) {
    val lineSize = maxWordsInLine(words, maxWidth, start)
    val end = start + lineSize
    lines.add(justify(words.slice(start until end), maxWidth, isLast = end == words.size))
    start += lineSize
  }
  return lines
}

fun maxWordsInLine(words: Array<String>, maxWidth: Int, start: Int): Int {
  var wCount = 0
  var cCount = 0
  for (i in start until words.size) {
    val nextWord = words[i]
    if (wCount + cCount + nextWord.length > maxWidth) {
      break
    }
    wCount += 1
    cCount += nextWord.length
  }
  return wCount
}

fun justify(words: List<String>, maxWidth: Int, isLast: Boolean): String {
  val cCount = words.map { it.length }.sum()
  val spacesToShare = maxWidth - cCount
  val spacesInBetween = if (words.size == 1) spacesToShare else spacesToShare / (words.size - 1)
  var spacesRemainder = if (words.size == 1) 0 else spacesToShare % (words.size - 1)
  val line = StringBuilder()
  var spacesAdded = 0
  for (w in words) {
    line.append(w)
    val spacesToAdd =
        if (isLast) 1
        else if (spacesRemainder > 0) spacesInBetween + 1.also { spacesRemainder -= it }
        else spacesInBetween
    if (spacesAdded != spacesToShare) {
      line.append(" ".repeat(spacesToAdd))
      spacesAdded += spacesToAdd
    }
  }
  line.append(" ".repeat(spacesToShare - spacesAdded))
  return line.toString()
}

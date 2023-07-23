private val validRes: List<Char> = ('0'..'9').toMutableList().also { it.addAll(listOf('T', 'F')) }

fun parseTernary(expression: String): String {
  var mergedExp = expression
  var i = mergedExp.length - 1
  while (mergedExp.length > 1) {
    while (mergedExp[i] != '?') {
      i--
    }
    val ex = mergedExp.substring(i - 1, i + 4)
    if (isAtomicTernary(ex)) {
      val evalEx = evaluateAtomicEx(ex)
      mergedExp = mergedExp.substring(0, i - 1) + evalEx + mergedExp.substring(i + 4)
      i--
    }
  }
  return mergedExp
}

private fun isAtomicTernary(ex: String): Boolean {
  return ex.length == 5 &&
      (ex[0] == 'T' || ex[0] == 'F') &&
      ex[1] == '?' &&
      ex[2] in validRes &&
      ex[3] == ':' &&
      ex[4] in validRes
}

private fun evaluateAtomicEx(ex: String): String {
  return (if (ex[0] == 'T') ex[2] else ex[4]).toString()
}

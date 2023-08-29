fun bestClosingTime(customers: String): Int {
  val n = customers.length
  val customersBefore = IntArray(n + 1)
  val customersAfter = IntArray(n + 1)
  for (i in 1..n) {
    val customerPrev = customersBefore[i - 1]
    customersBefore[i] = customerPrev + if (customers[i - 1] == 'Y') 1 else 0
  }
  for (i in n - 1 downTo 0) {
    customersAfter[i] = customersAfter[i + 1] + if (customers[i] == 'Y') 1 else 0
  }
  var bestTime = -1
  var minPenalty = Integer.MAX_VALUE
  for (i in 0..n) {
    val blankHours = i - customersBefore[i]
    val missedCustomers = customersAfter[i]
    val penalty = blankHours + missedCustomers
    if (penalty < minPenalty) {
      minPenalty = penalty
      bestTime = i
    }
  }
  return bestTime
}

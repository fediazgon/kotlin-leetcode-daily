fun myPow(x: Double, n: Int): Double {
  return if (n == 0) {
    1.0
  } else if (n < 0) {
    if (n == Integer.MIN_VALUE) x * myPow(1 / x, -(n + 1)) else myPow(1 / x, -n)
  } else {
    if (n % 2 == 0) myPow(x * x, n / 2) else x * myPow(x * x, (n - 1) / 2)
  }
}

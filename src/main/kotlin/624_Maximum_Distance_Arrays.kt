import kotlin.math.abs

// TODO: There is a better Single Scan version
class MaximumDistanceArrays624 {

    companion object {

        fun maxDistance(arrays: List<List<Int>>): Int {
            if (arrays.size == 1) {
                return 0
            }
            var minArr = -1
            var maxArr = -1
            var min = Int.MAX_VALUE
            var secondMin = Int.MAX_VALUE
            var max = Int.MIN_VALUE
            var secondMax = Int.MIN_VALUE
            for ((i, arr) in arrays.withIndex()) {
                if (arr.first() < min) {
                    minArr = i
                    secondMin = min
                    min = arr.first()
                } else if (arr.first() < secondMin) {
                    secondMin = arr.first()
                }
                if (arr.last() > max) {
                    maxArr = i
                    secondMax = max
                    max = arr.last()
                } else if (arr.last() > secondMax) {
                    secondMax = arr.last()
                }
            }
            return if (minArr != maxArr) {
                abs(max - min)
            } else {
                maxOf( abs(max - secondMin), (secondMax - min))
            }
        }

    }

}
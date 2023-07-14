import kotlin.math.abs

class MaximumDistanceArrays624 {

    companion object {

        fun maxDistance(arrays: List<List<Int>>): Int {
            var maxDistance = 0
            var min = arrays[0].first()
            var max = arrays[0].last()
            for (l in arrays.drop(1)) {
                val first = l.first()
                val last = l.last()
                maxDistance = maxOf(maxDistance, abs(max - first), abs(last - min))
                min = minOf(min, first)
                max = maxOf(max , last)
            }
            return maxDistance
        }

    }

}
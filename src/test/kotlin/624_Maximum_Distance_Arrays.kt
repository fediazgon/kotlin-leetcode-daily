import kotlin.test.Test
import kotlin.test.assertEquals

internal class MaximumDistanceArrays624Test {

    @Test
    fun example1() {
        assertEquals(
            4, MaximumDistanceArrays624.maxDistance(
                listOf(listOf(1, 2, 3), listOf(4, 5), listOf(1, 2, 3))
            )
        )
    }

    @Test
    fun example2() {
        assertEquals(
            0, MaximumDistanceArrays624.maxDistance(
                listOf(listOf(1), listOf(1))
            )
        )
    }

    @Test
    fun example3() {
        assertEquals(
            5, MaximumDistanceArrays624.maxDistance(
                listOf(listOf(1, 4, 5), listOf(0, 2))
            )
        )
    }

    @Test
    fun example4() {
        assertEquals(
            10, MaximumDistanceArrays624.maxDistance(
                listOf(listOf(0, 10), listOf(1, 2), listOf(0, 5))
            )
        )
    }

    @Test
    fun example5() {
        assertEquals(
            9, MaximumDistanceArrays624.maxDistance(
                listOf(listOf(0, 10), listOf(2, 9), listOf(2, 5))
            )
        )
    }

}


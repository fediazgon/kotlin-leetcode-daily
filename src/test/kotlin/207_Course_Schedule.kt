import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class CourseSchedule207Test {

    @Test
    fun example1() {
        assertTrue { CourseSchedule207.canFinish(2, arrayOf(intArrayOf(1, 0))) }
    }

    @Test
    fun example2() {
        assertFalse { CourseSchedule207.canFinish(2, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))) }
    }

}


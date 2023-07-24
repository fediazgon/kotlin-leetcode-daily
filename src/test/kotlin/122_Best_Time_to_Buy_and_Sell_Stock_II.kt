import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStock122Test {

    @Test
    fun example1() {
        assertEquals(7, maxProfitII(intArrayOf(7,1,5,3,6,4)))
    }


    @Test
    fun example2() {
        assertEquals(4, maxProfitII(intArrayOf(1,2,3,4,5)))
    }


    @Test
    fun example3() {
        assertEquals(0, maxProfitII(intArrayOf(7,6,4,3,1)))
    }
}
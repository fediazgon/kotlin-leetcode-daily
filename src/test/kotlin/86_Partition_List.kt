import kotlin.test.Test
import kotlin.test.assertEquals
import model.listNodeOf

class PartitionList86Test {

  @Test
  fun example1() {
    assertEquals(listNodeOf(1, 2, 2, 4, 3, 5), partition(listNodeOf(1, 4, 3, 2, 5, 2), 3))
  }

  @Test
  fun example2() {
    assertEquals(listNodeOf(1, 2), partition(listNodeOf(2, 1), 2))
  }

  @Test
  fun example3() {
    assertEquals(null, partition(null, 2))
  }

  @Test
  fun example4() {
    assertEquals(listNodeOf(1), partition(listNodeOf(1), 2))
  }
}

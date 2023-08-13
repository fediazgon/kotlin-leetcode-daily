import kotlin.test.Test
import kotlin.test.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse

class CheckIfThereIsAValidPartitionForTheArray2369Test {

  @Test
  fun example1() {
    assertTrue(validPartition(intArrayOf(4, 4, 4, 5, 6)))
  }

  @Test
  fun example2() {
    assertFalse(validPartition(intArrayOf(1, 1, 1, 2)))
  }
}

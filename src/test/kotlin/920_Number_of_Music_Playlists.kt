import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfMusicPlaylists920Test {

  @Test
  fun example1() {
    assertEquals(6, numMusicPlaylists(3, 3, 1))
  }

  @Test
  fun example2() {
    assertEquals(6, numMusicPlaylists(2, 3, 0))
  }

  @Test
  fun example3() {
    assertEquals(2, numMusicPlaylists(2, 3, 1))
  }

  @Test
  fun example4() {
    assertEquals(927191191, numMusicPlaylists(50, 100, 2))
  }
}

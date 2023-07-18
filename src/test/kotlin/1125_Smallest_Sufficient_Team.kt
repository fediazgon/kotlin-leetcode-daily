import kotlin.test.Test
import kotlin.test.assertContentEquals

class SmallestSufficientTeam1125Test {

  @Test
  fun example1() {
    assertContentEquals(
        intArrayOf(0, 2),
        smallestSufficientTeam(
            arrayOf("java", "nodejs", "reactjs"),
            listOf(listOf("java"), listOf("nodejs"), listOf("nodejs", "reactjs"))))
  }

  @Test
  fun example2() {
    assertContentEquals(
        intArrayOf(1, 2),
        smallestSufficientTeam(
            arrayOf("algorithms", "math", "java", "reactjs", "csharp", "aws"),
            listOf(
                listOf("algorithms", "math", "java"),
                listOf("algorithms", "math", "reactjs"),
                listOf("java", "csharp", "aws"),
                listOf("reactjs", "csharp"),
                listOf("csharp", "math"),
                listOf("aws", "java"))))
  }
}

class SmallestSufficientTeam1125 {

  companion object {

    fun smallestSufficientTeam(reqSkills: Array<String>, people: List<List<String>>): IntArray {
      val everyone = people.indices.toList()
      val noOne = listOf<Int>()
      val skillToIndex = reqSkills.withIndex().associateBy({ it.value }, { it.index })
      val peopleSkills = people.map { it.fold(0) { a, s -> a or (1 shl skillToIndex[s]!!) } }
      val nSkillsNeeded = 1 shl reqSkills.size
      val skillsNeededMask = nSkillsNeeded - 1
      val dp: Array<Array<List<Int>?>> = Array(nSkillsNeeded) { Array<List<Int>?>(people.size + 1) { null } }
      dp.forEach { it[people.size] = everyone }
      dp[0].fill(noOne)
      fun dfs(skillsNeededMask: Int, currentPersonIdx: Int): List<Int> {
        if (dp[skillsNeededMask][currentPersonIdx] != null) {
          return dp[skillsNeededMask][currentPersonIdx]!!
        }
        val take =
          dfs(skillsNeededMask and peopleSkills[currentPersonIdx].inv(), currentPersonIdx + 1) +
                  currentPersonIdx
        val skip = dfs(skillsNeededMask, currentPersonIdx + 1)
        val min = sequenceOf(take, skip).minBy { it.size }!!
        dp[skillsNeededMask][currentPersonIdx] = min
        return min
      }
      return dfs(skillsNeededMask, 0).toIntArray().reversedArray()
    }
  }
}

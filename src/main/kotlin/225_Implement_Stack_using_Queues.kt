import java.util.*

class MyStack {

  private val q1: Queue<Int> = LinkedList()
  private val q2: Queue<Int> = LinkedList()

  fun push(x: Int) {
    val qAdd = if (q1.isEmpty()) q1 else q2
    val qRem = if (q1.isEmpty()) q2 else q1
    qAdd.add(x)
    (1..qRem.size).forEach { _ -> qAdd.add(qRem.remove()) }
  }

  fun pop(): Int {
    val qRem = if (q1.isEmpty()) q2 else q1
    return qRem.remove()
  }

  fun top(): Int {
    val qRem = if (q1.isEmpty()) q2 else q1
    return qRem.peek()
  }

  fun empty(): Boolean {
    return q1.isEmpty() && q2.isEmpty()
  }
}

package example

import org.scalatest._

class ParallelSumSpec extends FlatSpec with Matchers {
  "ParallelSum" should "sum integers in parallel" in {
    val instance = new ParallelSumImpl()
    instance.sum(List(1,2,3,4,5,6,7,8,9,10)) should === (55)
  }
}

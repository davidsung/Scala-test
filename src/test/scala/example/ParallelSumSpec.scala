package example

import org.scalatest._

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

class ParallelSumSpec extends FlatSpec with Matchers {
  "ParallelSum" should "sum integers in parallel" in {
    val instance = new ParallelSumImpl()
    Await.result(instance.sum(List(1,2,3,4,5,6,7,8,9,10)), Duration.Inf) should === (55)
  }
}

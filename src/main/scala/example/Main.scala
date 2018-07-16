package example

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object Main extends App {
  implicit val ec = scala.concurrent.ExecutionContext.global
  val lastTerm = 500000000L
  val input = 1L to lastTerm
  val answer = (1L + lastTerm) * lastTerm / 2

  println(s"expected answer is $answer")
  println("single thread sum")
  val singleThreadAns = time(input.sum)
  println(s"Single thread sum: $singleThreadAns")

  val instance: ParallelSum = new ParallelSumImpl()

  println("Your implementation")
  val implAns = time(Await.result(instance.sum(input), Duration.Inf))
  println(s"Your implementation: $implAns")

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) / 1000.0 + " micro seconds")
    result
  }
}




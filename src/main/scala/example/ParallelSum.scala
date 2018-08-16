// Copyright (C) 2015-2018 Harborx Limited.
package example

import scala.concurrent.{ExecutionContext, Future}

trait ParallelSum {
  def sum(numbers: Seq[Long])(implicit ec: ExecutionContext): Future[Long]
}

class ParallelSumImpl extends ParallelSum {
  //Any kind of input is possible, not just the ones in Main.scala and in the test case
  override def sum(numbers: Seq[Long])(implicit ec: ExecutionContext): Future[Long] = {
    //please implement this function
    ???
  }
}


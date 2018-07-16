// Copyright (C) 2015-2018 Harborx Limited.
package example

import scala.concurrent.{ExecutionContext, Future}

trait ParallelSum {
  def sum(numbers: Seq[Long])(implicit ec: ExecutionContext): Future[Long]
}

class ParallelSumImpl extends ParallelSum {
  override def sum(numbers: Seq[Long])(implicit ec: ExecutionContext): Future[Long] = {
    //please change this function
    ???
  }
}


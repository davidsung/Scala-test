// Copyright (C) 2015-2018 Harborx Limited.
package example

import scala.concurrent.Future

trait ParallelSum {
  def sum(numbers: Seq[Int]): Future[Int]
}

class ParallelSumImpl extends ParallelSum {
  override def sum(numbers: Seq[Int]): Future[Int] = {
    //add your code here
    ???
  }
}


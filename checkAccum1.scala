#!scala
@main def entryPoint()= {
  class ChecksumAccumulator {
    // class definication
    var sum = 0
  }

  val acc = new ChecksumAccumulator
  val csa = new ChecksumAccumulator

  acc.sum = 3

  println(acc.sum)
  println(csa.sum)
}
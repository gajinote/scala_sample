#!scala
@main def entryPoint()= {
  class ChecksumAccumulator {
    // class definication
    private var sum = 0
    
    def add(b: Byte): Unit = {
      sum += b
    }

    def checksum(): Int = {
      return ~(sum & 0xFF) + 1
    }
  }

  val acc = new ChecksumAccumulator
  val csa = new ChecksumAccumulator

  acc.add(10)
  csa.add(1)
  val a1 = acc.checksum()
  val a2 = csa.checksum()
  println(a1)
  println(a2)
}

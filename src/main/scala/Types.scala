object Types {
  def printIt(a: Any): Unit = println(a)

  def main(args: Array[String]): Unit = {
    val a: List[Any] = List(
      "a string",
      732,
      'c',
      "\'",
      true,
      () => "returning a string"
    )

    //    a.foreach(println)
    val str = a(5);

    val b: Byte = 1
    val i: Int = 1
    val l: Long = 1L
    var s: Short = b;
    val d: Double = 1D;
    val f: Float = 1.3F;

    println(Byte.MaxValue)
    println(Integer.MAX_VALUE)
    println(Long.MaxValue)
    println(Short.MaxValue)
    println(Double.MaxValue)
    println(Float.MaxValue)
    println(BigInt)

    val x = 100000L

    val quote =
      """The essence of Scala:
        Fusion of functional and object-oriented
        programming in a typed setting.
        """

    println(quote)
  }
}

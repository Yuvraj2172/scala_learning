object FirstClassFunctions {
  def double(i: Int): Int = i * 2

  def main(args: Array[String]): Unit = {
    val a = List(1, 2, 3).map(double)
    println(a)

    val b = List(1, 2, 3).map(i => double(i))
    println(b)

    val nums = (1 to 10).toList
    val x = nums.filter(_>3)
      .filter(_<7)
      .map(_*10)
    println(x == List(40,50,60))
  }

}

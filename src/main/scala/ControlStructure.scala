object ControlStructure {

  def getClassString(x: Any): String = x match {
    case s: String => s"'$s' is a String'"
    case i: Int => "Int"
    case d: Double => "Double"
    case l: List[_] => "List"
    case _ => "Unknown"
  }

  def main(args: Array[String]): Unit = {
    val x = 10;

    if (x < 10) {
      println("negative")
    } else if (x == 0) {
      println("zero")
    }
    else {
      println("positive")
    }

    val ints: List[Int] = List(1, 2, 3, 4, 5)
    for (i <- ints if i > 2) println(i)

    for {i <- 1 to 3
         j <- 'a' to 'c'
         if i == 2
         if j == 'b'} {
      println(s"i = $i, j = $j")
    }

    val doubles = for (i <- ints) yield i * 2
    println(doubles)

    val names: List[String] = List("chris", "ed", "maurice")
    val capNames = for (name <- names) yield name.capitalize
    println(capNames)

    val fruits = List("apple", "banana", "lime", "orange")
    val fruitsLengths =
      for (f <- fruits if f.size > 4) yield f.size

    println(fruitsLengths)

    val i = 1;
    val res = i match {
      case 1 => "one"
      case 2 => ("two")
      case 3 => ("three")
      case _ => ("other")
    }
    println(res)

    println(getClassString(1))
    println(getClassString("yuvraj"))
    println(getClassString(List(1, 2, 4)))


  }
}

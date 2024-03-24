import scala.Console.println

object Collections {

  case class Person(name: String)

  def main(args: Array[String]): Unit = {
    val a = List(1, 2, 3)

    val b = (1 to 5).toList
    val c = (1 to 10 by 2).toList
    val e = (1 until 5).toList
    val f = List.range(1, 5)
    val g = List.range(1, 10, 3)

    println(a)
    println(b)
    println(c)
    println(e)
    println(f)
    println(g)

    val h = List(10, 20, 30, 40, 10)
    val i = h.drop(2)
    println(i)

    println(h.dropWhile(_ < 25))
    println(h.dropRight(2))
    println(h.filter(_ < 25))

    println(h.slice(2, 3))
    println(h.tail)
    println(h.take(3))
    println(h.takeWhile(_ < 30))

    val j = List(List(1, 2), List(3, 4))
    println(j.flatten)

    val nums = List("one", "two")

    println(nums.map(_.toUpperCase))
    println(nums.flatMap(_.toUpperCase))

    val firstTen = (1 to 10).toList

    println(firstTen.reduceLeft(_ + _))

    println(firstTen.foldLeft(100)(_ + _))

    val tup = (11, "eleven", Person("Eleven"))

    tup.productIterator.foreach {
      element =>
        println(s"Element : $element")
    }

    val (num, str, person) = tup
    println(person)

  }
}

import StringUtils._

import scala.math._

object StringUtils {


  def isNullOrEmpty(s: String): Boolean = s == null || s.trim.isEmpty

  def leftTrim(s: String): String = s.replaceAll("^\\s+", "")

  def rightTrim(s: String): String = s.replaceAll("\\s+$", "");

}

//companion objects
class Circle(radius: Double) {

  import Circle._

  def area: Double = calculateArea(radius)
}

object Circle {
  private def calculateArea(radius: Double): Double =
    Pi * pow(radius, 2.0)
}

trait AddService {
  def add(a: Int, b: Int) = a + b;
}

trait MultiplyService {
  def multiply(a: Int, b: Int) = a * b
}
object  MathService extends AddService with  MultiplyService


object SingletonObject  extends AddService with  MultiplyService {
  def main(args: Array[String]): Unit = {
    val x = isNullOrEmpty(new String())
    val x2 = StringUtils.isNullOrEmpty("a");
    println(x, x2)

    val circle = new Circle(5.0)
    circle.area

    println(add(1,2))
    println(multiply(4,5))
  }
}

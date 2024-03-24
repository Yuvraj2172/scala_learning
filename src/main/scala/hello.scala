import scala.io.StdIn.readLine

object hello {
  def main(args: Array[String]): Unit = {
    println("please enter your name!")
    val name = readLine();
    println("hello, " + name + "!")
  }
}
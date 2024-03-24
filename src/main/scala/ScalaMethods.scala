import java.io.{PrintStream, PrintWriter, StringWriter}
import scala.reflect.io.Path.extension

object ScalaMethods {
  def sumOwn(a: Int, b: Int): Int = a + b

  def concatename(s1: String, s2: String): String = s"$s1  $s2"

  def getStackTraceAsString(t: Throwable): String = {
    val sw = new StringWriter
    t.printStackTrace(new PrintWriter(sw))
    sw.toString
  }

  def makeConnection(url: String = "https://localhost", timeout: Int = 5000): Unit = {
    println(s"url = $url, timeout = $timeout")
  }


  def main(args: Array[String]): Unit = {
    println(sumOwn(1, 2))
    println(concatename("Yuvraj", "Soni"))
    try {
      println(2 / 0)
    }
    catch {
      case e => println(getStackTraceAsString(e))
    }
    makeConnection("www.google.com")
    println("www.google.com")


  }
}

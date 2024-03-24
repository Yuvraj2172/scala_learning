import org.apache.spark.sql.execution.PlanLater

object VariablesandDatatypes {
  def main(args: Array[String]): Unit = {
    val a = 0;
    //    var b = 1;

    val msg = "Hello, world"
    //    msg = "Yuvraj" // reassignment to val, convert val to var

    var msg2 = "Hello, world";
    msg2 = "India";

    val x: Int = 1;
    //    val x = 10

    val b: Byte = 1;
    val i: Int = 1
    val l: Long = 1;
    val s: Short = 1;
    val d: Double = 1;
    val f: Float = 1;

    println(b)
    println(i)
    println(l)
    println(s)
    println(d)
    println(f)

    val x1 = 1000L;
    val y = 2.2D
    val z = 3.3f;

    println(x1, y, z)

    val m = BigInt(13242536475635667L)
    val n = BigDecimal(122.4324)
    println(m.getClass)

    val name = "Yuvraj"
    val ch = 'a';

    println(name)
    println(ch)

    val firstName = "John"
    val mi = 'C'
    val lastname = "Doe"
    println(s"Name : ${firstName} $mi $lastname")

    println(s"2 + 2 = ${2 + 2}") // "2 + 2 = 4"

    val neg = -1;
    println(s"neg.abs = ${neg.abs}")

    val quote =
      """The essence of Scala:
        |Fusion of functional and object-oriented
        |programming in a typed string
        |""".stripMargin

    println(quote)
  }
}

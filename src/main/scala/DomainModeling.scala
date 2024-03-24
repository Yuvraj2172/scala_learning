import CrustSize.{Large, Medium, Small}

trait Speaker {
  def Speak(): String
}

trait TailWagger {
  def startTail(): Unit = println("tail is wagging")

  def stopTail(): Unit = println("tail is stopped")
}

trait Runner {
  def startRunning(): Unit = println("I'm running")

  def stopRunning(): Unit = println("Stopped running")
}

class Dog(val name: String) extends Speaker with TailWagger with Runner {
  def Speak(): String = "Woof"
}

class Cat(val name: String) extends Speaker with TailWagger with Runner {
  def Speak(): String = "wow"

  override def startRunning(): Unit = println("Yeah, I slay and dont run")

  override def stopRunning(): Unit = println("I ain't stopping")

}


object DomainModeling {
  def main(args: Array[String]): Unit = {
    //    val d = new Dog("Rover")
    //    println(d.name)
    //    d.Speak()
    //
    //    val c = new Cat("Morris")
    //    println(c.Speak());
    //    println(c.name)
    //    c.startRunning()
    //    c.stopRunning()

    //    val p = new Person("Yuvraj", "Soni") // constructor for the person class
    //    println(p.firstName, p.lastName)
    //    p.lastName = "Legend"
    //    p.printFullName()

    val currentSize = Small
//    currentSize match {
    //      case Small => println("Small crust size")
    //      case Medium => println("Medium crust size")
    //      case Large => println("Large crust size")
    //    }
    //

    val p = Person2("Reginald Kenneth Dwight", "Singer")
    println(p.toString)
    val p2 = p.copy(vocation = "Author");
    println(p == p2)
    println(p2.toString)

  }
}


class Person(var firstName: String, var lastName: String) {
  def printFullName() = println(s"$firstName $lastName")
}

sealed abstract class CrustSize

object CrustSize {
  case object Small extends CrustSize

  case object Medium extends CrustSize

  case object Large extends CrustSize
}

sealed abstract class CrustType

object CrustType {
  case object Thin extends CrustType

  case object Thick extends CrustType

  case object Regular extends CrustType
}


sealed abstract class Topping

object Topping {
  case object Cheese extends Topping

  case object Pepperoni extends Topping

  case object BlackOlives extends Topping

  case object GreenOlives extends Topping

  case object Onions extends Topping
}

case class Person2(name : String, vocation : String)


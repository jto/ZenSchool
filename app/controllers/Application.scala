package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def cheatsheet = Action {

    // You can import anywhere in scala
    // import are scoped
    // This import will make play.Logger available only INSIDE this Action
    import play.Logger

    // variable declaration
    // PROTIP: var are generally considered a bad by scala dev (prefer val)
    var v1 = "Hello"
    // Optionnaly, you can define types (in scala, you can "give" a type to every expression, and pretty much eveything is en expression)
    // @see: class hierachy: http://www.scala-lang.org/node/71?size=_original
    var v2: Int = 4

    // val are immutable values
    // If you hesitate between `var` and `val`, use `val`.
    val meaningOfLifeUniverseAndEverything = 42

/*
* -- Blocks
*/
    // In scala, you can create blocks of code anywhere
    val fourPlusSix = {
      val four = 4
      val six = 6
      Logger.info("four: " + four)
      Logger.info("six: " + six)
      4 + 6
    }
    Logger.info("fourPlusSix: " + fourPlusSix)



/*
* -- Iterating on a Collection
*/
    // `to` is just a method on Int class
    // it creates a Collection of Int for 1 to 5
    for(i <- 1.to(5)){
      Logger.info("Iteration: " + i)
    }

    // This is just a function that created a List containing
    // 1, 2, 3, 4, 5 and 6
    val xs = List(1, 2, 3, 4, 5, 6)

/*
* -- Generic types
*/
    // Scala support generics types, the syntax is almost the same as Java
    val xs1: List[Int] = List(1, 2, 3, 4, 5, 6)
    // You can type anything, anywhere
    val xs2 = List(1, 2, 3, 4, 5, 6): List[Int]

/*
* -- Some cool types
*/
    // Scala Support tupples
    // A tupple is just a fixed size collection of elements
    // Each element is typed
    val t = (1, "Hello", List(1, 2, 3))

    Logger.info("Tupple First element: " + t._1)

    // Of course, you can force types
    val ttyped: (Number, String, Iterable[Int]) = (1, "Hello", List(1, 2, 3))


/*
* -- Method definition
*/

    // method definition
    // Parameter types are MANDATORY
    // The last expression is the returned value (no `return` keyword)
    //  ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚
    //  ✚ TAKE CARE: THERE'S AN `=` HERE
    //  ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚ ✚
    //                     ⬇⬇⬇
    def hello(name: String) = { // ⬅ ⬅ ⬅
      //                   ⬆⬆⬆
      "Hello %s!".format(name)
    }

    // for single lines expressions (very common in scala), brackets are generally ommited
    def hej(name: String) = "Hej %s!".format(name)

    // If you omit the `=`
    // The method return `Unit` (Scala equivalent of Java's `void`)
    // So, DON'T FORGET THE FREAKING EQUAL
    //                       ⬇⬇⬇
    def noReturn(name: String) {
      "Hello %s!".format(name)
    }

    Logger.info("noReturn: " + noReturn("Test"))

/*
* -- Classes
*/
    // Scala class are just like java classes
    class Foo(bar: String){
      def this() = this("Hello World")
    }

    // Scala does not have static methods
    // but it has native support for Singleton, (they are called object)
    object Bar {
      // When defining a method that does not take parameters, you can ommit parenthesis
      // Convention is, us parenthesis when the method is side-effecty (IO, state mutation)
      def gimmeFive = "High Five!"
    }

    // This is a method call
    // println in defined in scala.Predef
    // Everything in predef is magically imported
    Logger.info("Bar.gimmeFive: " + Bar.gimmeFive)

    // Scala support class inherithence
    class DaFoo(name: String) extends Foo("Da %s".format(name))

/*
* -- Trait
*/

    // Trait are interfaces with implementation
    trait What {
      def saysWhat = "Say What ?"
    }
    trait Who {
      def saysWho = "Says Who ?"
    }

    // Multiple traits can be mixed together
    class FooBar extends Foo("Martin") with What with Who

    val f = new FooBar
    Logger.info("f.saysWho: " + f.saysWho)

/*
* -- Overriding methods
*/
    class FB extends Foo("Martin") with What with Who {
      override def saysWho = "Says me"
    }

/*
* -- Abstract methods
*/
    // In scala, a method is abstract if it has no body (no keyword)
    trait DoThing {
      def thing(t: String): String
    }

    class Do extends DoThing {
      def thing(t: String): String = "Do %s".format(t)
    }

/*
* -- Self type
*/

    // trait can have constraint on the type they can be mixed with
    trait CanAddInt {
      def add(other: Int): Int
    }

    trait CanAddFour {
      self: CanAddInt =>
        // Since I know this trait can only be mixed with instances of CanAddInt
        // I can call the add method
        def addFour = self.add(4)
    }

    class MySuperAwesomeInt(wrapped: Int) extends CanAddInt with CanAddFour {
      override def add(other: Int): Int = wrapped + other
    }

    // Self type prevent you from doing this
    // [error]  self-type WontCompile does not conform to CanAddFour's selftype CanAddFour with CanAddInt
    // [error]     class WontCompile(wrapped: Int) extends CanAddFour
    /*
      class WontCompile(wrapped: Int) extends CanAddFour
    */

    Logger.info("MySuperAwesomeInt(1).addFour: " + new MySuperAwesomeInt(1).addFour)

    Ok("CODE CODE CODE CODE")
  }

}
//  /$$$$$$$$                      /$$$$$$            /$$                           /$$         /$$ /$$     /$$
// |_____ $$                      /$$__  $$          | $$                          | $$        / $$/ $$   /$$$$
//      /$$/   /$$$$$$  /$$$$$$$ | $$  \__/  /$$$$$$$| $$$$$$$   /$$$$$$   /$$$$$$ | $$       /$$$$$$$$$$|_  $$
//     /$$/   /$$__  $$| $$__  $$|  $$$$$$  /$$_____/| $$__  $$ /$$__  $$ /$$__  $$| $$      |   $$  $$_/  | $$
//    /$$/   | $$$$$$$$| $$  \ $$ \____  $$| $$      | $$  \ $$| $$  \ $$| $$  \ $$| $$       /$$$$$$$$$$  | $$
//   /$$/    | $$_____/| $$  | $$ /$$  \ $$| $$      | $$  | $$| $$  | $$| $$  | $$| $$      |_  $$  $$_/  | $$
//  /$$$$$$$$|  $$$$$$$| $$  | $$|  $$$$$$/|  $$$$$$$| $$  | $$|  $$$$$$/|  $$$$$$/| $$        | $$| $$   /$$$$$$
// |________/ \_______/|__/  |__/ \______/  \_______/|__/  |__/ \______/  \______/ |__/        |__/|__/  |______/
//


package exercices
import provided._
import provided.Helpers._

// TODO:
// ✔ implicit parameters
// ✔ implicit conversion
// ✔ Pattern Matching
// ✔ apply / unapply
// ✔ type alias
// ✗ covariance / contravariance
// ✗ parameters default values
// ✗ Streams
// ✗ Option
// ✗ Either
// ✔ Operator overloading
// ✔ flatMap !!!!


//
//     /$$   /$$                           /$$       /$$   /$$           /$$                  /$$$$
//    | $$$ | $$                          | $$      | $$  | $$          | $$                 /$$  $$
//    | $$$$| $$  /$$$$$$   /$$$$$$   /$$$$$$$      | $$  | $$  /$$$$$$ | $$  /$$$$$$       |__/\ $$
//    | $$ $$ $$ /$$__  $$ /$$__  $$ /$$__  $$      | $$$$$$$$ /$$__  $$| $$ /$$__  $$          /$$/
//    | $$  $$$$| $$$$$$$$| $$$$$$$$| $$  | $$      | $$__  $$| $$$$$$$$| $$| $$  \ $$         /$$/
//    | $$\  $$$| $$_____/| $$_____/| $$  | $$      | $$  | $$| $$_____/| $$| $$  | $$        |__/
//    | $$ \  $$|  $$$$$$$|  $$$$$$$|  $$$$$$$      | $$  | $$|  $$$$$$$| $$| $$$$$$$/         /$$
//    |__/  \__/ \_______/ \_______/ \_______/      |__/  |__/ \_______/|__/| $$____/         |__/
//                                                                          | $$
//                                                                          | $$
//
//           ➽ http://www.scala-lang.org/api/current/index.html
//           ➽ https://groups.google.com/forum/?fromgroups#!forum/scala-user
//           ➽ http://docs.scala-lang.org/style/



object Classes {

  /**
  * TODO:
  * Create the Person trait
  * A Person has:
  * - a firstname
  * - a lastname
  * - an age
  * - a sex (Of type Sex)
  * Optionnal: A Person can only be a Man or a Woman, anything else should not Compile
  *    ➽ http://www.scala-lang.org/node/123
  */
  import Sex.Sex
  trait Person

  /**
  * TODO:
  * Create the Man class
  * A Man is a Person, with sex "Male"
  */
  class Man

  /**
  * TODO:
  * Create the Man class
  * A Man is a Person, with sex "Woman"
  */
  class Woman

  /**
  * TODO:
  * The Etiquette trait
  * The Etiquette trait has:
  * - a method called `greet` the method takes a Person, and say Hello to that person`
  */
  trait Etiquette

  /**
  * A Gentleman is a Man with good manners
  */
  class Gentleman

  /**
  * A Lady is a Woman with good manners
  */
  class Lady

  import Colors._ //Use Colors.Red or Colors.Blue
  class Scarf(color: Color)

  /**
  * TODO:
  * The Knitting trait
  * - Only a Woman is allowed to Knit
  *     ➽ http://www.scala-lang.org/node/124
  * The Knitting trait has:
  * - a method called `knit` the method takes a Person, and returns a Scarf for that person
  * - A Man should be offered a blue Scarf, while a Woman would have a red Scarf (Use pattern matching)
  *     ➽ http://www.scala-lang.org/node/120
  */
  trait Knitter {
    def knit(to: Person): Scarf
  }


  /**
  * TODO:
  * An Granny is a Lady who knows the fine art of Knitting
  */
  class Granny
}


// "A companion object is an object with the same name as a class or trait
// and is defined in the same source file as the associated file or trait.
// A companion object differs from other objects as it has access rights to the class/trait that other objects do not.
// In particular it can access methods and fields that are private in the class/trait."
//  ➲ http://daily-scala.blogspot.fr/2009/09/companion-object.html
object Companions {
  class User(login: String, password: String)

  /**
  * TODO:
  * Implement user Apply and unapply methods
  */
  object User {
    def apply(login: String, password: String): User = TODO
    //  ➽ http://www.scala-lang.org/node/112
    def unapply(u: User): Option[(String, String)]= TODO
  }
}

object Functions {
  /**
  * TODO:
  * Create a function that takes 2 int, and compute the sum of 2 ints
  * NOTE:
  * ((Int, Int) => Int)
  * - Is the type of a function that takes two Ints, and return an Int
  * - It's just a nice syntax for Function[Int, Int, Int]
  * - In scala, Functions are Objects too
  */
  val add: ((Int, Int) => Int) = TODO

  /**
  * TODO:
  * create a add2 function, that takes an Int and add 2 to it
  */
  val add2: (Int => Int) = TODO

  /**
  * TODO:
  * create a addAnythingBuidler function, that takes an Int and add 2 to it
  * addAnythingBuidler(2)(4) == 6
  */
  val addAnythingBuidler: (Int => Int => Int) = TODO

  /**
  * TODO:
  * re-implement add2, usgin addAnythingBuidler
  */
  val addII: (Int => Int) = TODO

}

object Collections {
  /**
  * TODO:
  * Compute the sum of all elements in the List
  * var are authorized
  * @param xs A list of Int
  * @return The sum of all elements in the List
  */
  def uglysum(xs: List[Int]): Int = {
    TODO
  }

  //  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★
  //  ★                                                                                   ★
  //  ★   /$$   /$$ /$$$$$$$$ /$$      /$$       /$$$$$$$  /$$   /$$ /$$       /$$$$$$$$  ★
  //  ★  | $$$ | $$| $$_____/| $$  /$ | $$      | $$__  $$| $$  | $$| $$      | $$_____/  ★
  //  ★  | $$$$| $$| $$      | $$ /$$$| $$      | $$  \ $$| $$  | $$| $$      | $$        ★
  //  ★  | $$ $$ $$| $$$$$   | $$/$$ $$ $$      | $$$$$$$/| $$  | $$| $$      | $$$$$     ★
  //  ★  | $$  $$$$| $$__/   | $$$$_  $$$$      | $$__  $$| $$  | $$| $$      | $$__/     ★
  //  ★  | $$\  $$$| $$      | $$$/ \  $$$      | $$  \ $$| $$  | $$| $$      | $$        ★
  //  ★  | $$ \  $$| $$$$$$$$| $$/   \  $$      | $$  | $$|  $$$$$$/| $$$$$$$$| $$$$$$$$  ★
  //  ★  |__/  \__/|________/|__/     \__/      |__/  |__/ \______/ |________/|________/  ★
  //  ★                                                                                   ★
  //  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★
  //  ★                                                                                   ★
  //  ★                     the `var` keyword now is FORBIDDEN                            ★
  //  ★                     the `var` keyword now is FORBIDDEN                            ★
  //  ★                     the `var` keyword now is FORBIDDEN                            ★
  //  ★                     the `var` keyword now is FORBIDDEN                            ★
  //  ★                     the `var` keyword now is FORBIDDEN                            ★
  //  ★                                                                                   ★
  //  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★  ★

  /**
  * TODO:
  * Compute the sum of all elements in the List
  */
  def sum(xs: List[Int]): Int = {
    TODO
  }

  /**
  * TODO:
  * Add 2 to all elements of the provided List
  */
  def add2toAlll(xs: List[Int]): List[Int] = TODO

  /**
  * TODO:
  * Add 2 to all elements of the provided List
  * (xs: List[Int])(x: Int)
  * - This is called a curried Function
  * - It's equivalent to
  *    Int => (List[Int] => List[Int])
  * - It takes a Int as a parameter (x) and returns a function, taking a List[Int], and returning a List[Int]
  */
  def addToAll(xs: List[Int])(x: Int): List[Int] = TODO

  /**
  * TODO:
  * Rewrite add2toAll using addToAll and partial function application
  */
  def nicelyAdd2ToAll(xs: List[Int]): List[Int] = TODO

  /**
  * TODO:
  * Write the map function
  * This function applies the f function to all the elements of xs
  */
  def map(f: (Int => Int))(xs: List[Int]): List[Int] = TODO

  /**
  * TODO:
  * Explain what this does
  */
  def add2ToAllAgain(xs: List[Int]): List[Int] = map(x => x + 2)(xs)

  /**
  * TODO:
  * Explain how this works
  */
  val add2ToAllAgainAlternative = map(x => x + 2) _

  /**
  * TODO:
  * Write the reduce function
  * reduce((acc, current) => acc + current)(List(1, 2, 3, 4, 5)) == 15
  */
  def reduce(f: (Int, Int) => Int)(xs: List[Int]): Int = TODO

  /**
  * TODO:
  * Write the fold function
  */
  def fold(f: (Int, Int) => Int, init: Int)(xs: List[Int]): Int = TODO

  /**
  * TODO:
  * re-write reduce using fold
  */
  def reduceByFolding(f: (Int, Int) => Int)(xs: List[Int]): Int = TODO

  /**
  * TODO:
  * re-write the map function using fold
  * you can use List#foldLeft
  */
  def mapByFolding(f: Int => Int)(xs: List[Int]): List[Int] = TODO

  // >>> Read It Later
  //  ➽ http://www.codecommit.com/blog/scala/scala-collections-for-the-easily-bored-part-1
  //  ➽ http://www.codecommit.com/blog/scala/scala-collections-for-the-easily-bored-part-2
  //  ➽ http://www.codecommit.com/blog/scala/scala-collections-for-the-easily-bored-part-3
}

object Generics {

  /**
  * TODO:
  * write a generic version of fold
  * - It should work on a List on Anything
  * - init parameter can have any type
  * - The return type is NOT Unit, you have to find it
  */
  def fold[A, B](f: (B, A) => B, init: B)(xs: List[A]): B = xs match {
    case Nil => init
    case x :: xs => fold(f, f(init, x))(xs)
  }

  /**
   * TODO:
   * write a generic version of map
   * - It should work on a List on anything
   * - the f function can return anything
   * - Find the return type by yourself
   */
   def map[A, B](f: A => B)(xs: List[A]) = fold((acc: List[B], n: A) => f(n) :: acc ,Nil)(xs).reverse

   /**
   * TODO:
   * write a generic reduce, using your implementation of fold
   * The return type is something that extends A (xs is a List[A])
   */
   def reduce[A, B >: A](f: (B, A) => B)(xs: List[A]): B = fold(f, xs.head)(xs.tail)


   /**
    * TODO:
    * implement the flatMap method
    * flatMap
    * - Takes a List of anything (call it A)
    * - Takes a function from A to something else (call it B)
    * - it returns a List of B
    */
   def flatMap[A, B](f: (A) => List[B])(xs: List[A]): List[B] = fold({ (acc: List[B], n: A) =>
     f(n) ++ acc
   }, Nil)(xs)


   /**
    * TODO:
    * write the filter method using flatMap
    * It take a List of anything (call it A), a function from that takes an A and give a Boolean
    * It returns a List of A
    */
   def filter[A](f: A => Boolean)(xs: List[A]) = flatMap( { x: A => f(x) match {
     case true => List(x)
     case _ => Nil
   }})(xs)

    /**
     * TODO:
     * write the zip method
     * It takes a List[A], a List[B] and returns a List[(A,B)] (use map)
     */
    def zip[A, B](xs1: List[A], xs2: List[B]): List[(A, B)] = TODO

    // TODO: http://stackoverflow.com/questions/4465948/what-are-scala-context-and-view-bounds
    // <%
    // TODO: http://stackoverflow.com/questions/3427345/what-do-and-mean-in-scala-2-8-and-where-are-they-documented
    //, =:=, <:<, <%<

}


object Flatmap{
  import provided.models._
  import scala.util.control._

   /**
   * TODO:
   * write the findAll method
   * It takes a List[String], and parse Ints, and call DAO.get to find Users in database
   * use the provided.Helpers#parseInt (in provided.scala), and List#flatmap
   */
  def findAll(ids: List[String]): List[User] = TODO


  /**
   * TODO:
   * re-write findAll, using for comprehension
   */
  def findAllWithFor(ids: List[String]): List[User] = TODO
}

object Implicits {


  /**
   * TODO:
   * When WhatsThisType is used, you have to replace it by the real type
   */
  type WhatsThisType = Any

  /**
   * TODO:
   * correct the signature of the eq method
   */
  trait Equality[X] {
    // def eq (a: WhatsThisType, b: WhatsThisType): Boolean
    def eq (a: X, b: X): Boolean
  }


  /**
   * TODO:
   * Create an implementation of Equality that knows how to compare Int
   */
  object IntEquality extends Equality[Int] {
    override def eq(a: Int, b: Int): Boolean = a == b
  }

  /**
   * TODO:
   * Create an implementation of Equality that knows how to compare Int
   */
  object StringEquality  extends Equality[String] {
    override def eq(a: String, b: String): Boolean = a == b
  }

  /**
  * TODO:
  * write the === method
  * It takes two element of the same type, and implicitly take an implementation if Equality for this type
  * It returns true if elements are equals, false otherwise
  */
  //def areEquals(a: WhatsThisType, b: WhatsThisType)(implicit c: WhatsThisType) = TODO
  def areEquals[X](a: X, b: X)(implicit c: Equality[X]) = c.eq(a, b)


  /**
   * TODO:
   * Create an implementation of Equality that knows how to compare List of anything for which there is an implementation od Equality in Scope
   * List are equals if
   * - They have the same size
   * - elements are equals, and in the same order
   * HELP: use the implicitly method
   *  ➽ http://www.scala-lang.org/api/current/scala/Predef$.html
   * HELP: You should probably make all implementation of Equality usable as implicit parameters
   */
   object ListEquality {
     // [X: Equality] This means that there should be an implementation of Equality[X] available in scope
     //def eq[X: Equality](a: WhatsThisType, b: WhatsThisType): Boolean = TODO
     def eq[X: Equality](as: List[X], bs: List[X]): Boolean = {
       as.zip(bs).forall{
         case (a, b) => implicitly[Equality[X]].eq(a, b)
      }
     }
   }

  /**
   * TODO:
   * write the === method
   * It takes two element of the same type, and implicitly take an implementation if Equality for this type
   * It returns true if elements are equals, false otherwise
   */
  trait Equalizer[X] {
    def value: X
    def ===(b: X)(implicit c: Equality[X]): Boolean = c.eq(value, b)
  }

  /**
   * TODO:
   * implement the 3 implicit conversion methods
   */
  object Conversions {
    implicit def intToEqualizer(i: Int) = new Equalizer[Int] {
      def value = i
    }
    implicit def stringToEqualizer(s: String) = new Equalizer[String] {
      def value = s
    }
    implicit def listToEqualizer[A](xs: List[A]) = new Equalizer[List[A]] {
      def value = xs
    }
  }


  /**
  * TODO; write an implementation of EqEquality that work for any type X that have a method ==(b: X): Boolean
  * HELP: google Structural typing
  */
  // TODO: ask Sadek
  type C= { def ==(b: C): Boolean }
  object EqEquality extends Equality[C]{
    override def eq(a: C, b: C): Boolean = a == b
  }

}


object FunkyUnapply {
  object &&& {
    def unapply[A,B](t: (Option[A], Option[B])): Option[(A, B)] =
      for(
        t1 <- t._1;
        t2 <- t._2
      ) yield (t1, t2)
  }

  object ||| {
    def unapply[A,B](t: (Option[A], Option[B])): Option[(Option[A], Option[B])] = t match {
      case (o1: None.type, o2: None.type) => None
      case _ => Option(t._1 -> t._2)
    }
  }
}


// >>> More exercices
//  ➽ http://blog.tmorris.net/monad-exercises-in-scala/

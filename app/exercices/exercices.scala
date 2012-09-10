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
// ✗ implicit parameters
// ✗ implicit conversion
// ✗ Pattern Matching
//  ✔ apply / unapply
// ✗ type alias
// ✗ covariance / contravariance
// ✗ parameters default values
// ✗ Streams
// ✗ Operator overloading
// ✗ flatMap !!!!


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
  */
  def mapByFolding(f: Int => Int)(xs: List[Int]): List[Int] = TODO

  // >>> Read It Later
  //  ➽ http://www.codecommit.com/blog/scala/scala-collections-for-the-easily-bored-part-1
  //  ➽ http://www.codecommit.com/blog/scala/scala-collections-for-the-easily-bored-part-2
  //  ➽ http://www.codecommit.com/blog/scala/scala-collections-for-the-easily-bored-part-3
}

object Generics {

}

// >>> More exercices
//  ➽ http://blog.tmorris.net/monad-exercises-in-scala/

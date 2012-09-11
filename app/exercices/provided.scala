package provided

object Colors extends Enumeration {
  type Color = Value
  val Blue, Red, Green = Value
}

object Sex extends Enumeration {
  type Sex = Value
  val Male, Female = Value
}

class TODOException extends RuntimeException("TODO")

object Helpers {
  def TODO = throw new TODOException

  import scala.util.control.Exception._
  /**
   * This method takes a String, try to parse it as an It
   * if it fails to parse the String, it returns an empty list
   * otherwise, it returns a List of one Int
   */
  def parseInt(s: String): Either[Throwable, Int] = catching(classOf[NumberFormatException]).either{
    Integer.parseInt(s)
  }
}

package models {
  case class User(id: Int, login: String)
  object DAO {
    private val data: Map[Int, User] = (for(i <- 1.to(20)) yield (i -> User(i, "User_" + i))).toMap

    def get(id: Int): List[User] = data.get(id).toList
  }
}
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
}
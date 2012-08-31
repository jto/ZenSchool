package provided

object Colors extends Enumeration {
  type Color = Value
  val Blue, Red, Green = Value
}
class TODO extends RuntimeException("TODO")
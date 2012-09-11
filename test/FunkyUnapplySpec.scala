package test

import org.specs2.mutable._

import provided._
import provided.Helpers._
import exercices.FunkyUnapply._

class FunkyUnapplySpec extends Specification {

  "|||" should {
    "match if one of the elements of the tupple is Some" in {
      (Some(1), None) match {
        case a ||| b => success
        case _ => failure
      }

      (None, Some("Yep")) match {
        case a ||| b => success
        case _ => failure
      }
    }

    "not match if none of the elements of the tupple is Some" in {
      (None, None) match {
        case a ||| b => failure
        case _ => success
      }
    }
  }

  "&&&" should {
    "match if both elements of the tupple are Some" in {
      (Some(1), Some(2)) match {
        case a &&& b => success
        case _ => failure
      }
    }

    "fail is one element is None" in {
      (Some(1), None) match {
        case a &&& b => failure
        case _ => success
      }

      (None, Some("Yep")) match {
        case a &&& b => failure
        case _ => success
      }
    }
  }
}
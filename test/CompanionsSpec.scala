package test

import org.specs2.mutable._

import provided._
import provided.Helpers._
import exercices.Companions._

class CompanionsSpec extends Specification {

  "a User" should {
    "have a factory method" in {
      TODO
      success
      // val u = User("jto", "s3cr3t")
      // u.login shouldEqual("jto")
      // u.password shouldEqual("s3cr3t")
    }

    "be usable in pattern matching" in {
      TODO
      success
      // val u = User("jto", "s3cr3t")
      // u match {
      //   case User("jto", "s3cr3t") => success
      //   case _ => fail("Pattern matching on User failed")
      // }
    }
  }
}
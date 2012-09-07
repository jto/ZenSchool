package test

import org.specs2.mutable._

import provided._
import exercices.Companions._

class CompanionsSpec extends Specification {

  "a User" should {
    "have a factory method" in {
      val u = User("jto", "s3cr3t")
      u.login shouldEqual("jto")
      u.password shouldEqual("s3cr3t")
    }

    "be usable in pattern matching" in {
      val u = User("jto", "s3cr3t")
    }
  }
}
package test

import org.specs2.mutable._

import provided._
import exercices.Classes._

class ClassesSpec extends Specification {

  val prof = new Man(firstname = "Hubert", lastname = "Fansworth", age = 160)
  val leela = new Woman(firstname = "Leela", lastname = "Turanga", age = 27)
  val scruffy = new Gentleman(firstname = "Scruffy", lastname = "Thejanitor", age = 42)
  val mom = new Lady(firstname = "??", lastname = "??", age = 170)
  val crazyold = new Gentleman(firstname = "Crazy old cat woman", lastname = "??", age = 140)

  "A Man" should {
    "be a Male" in {
      prof.sex shouldEqual(Sex.Male)
    }
  }

  "A Woman" should {
    "be a Female" in {
      leela.sex shouldEqual(Sex.Female)
    }
  }

  "A Gentleman" should {
    "be a Male" in {
      scruffy.sex shouldEqual(Sex.Male)
    }

    "know how to greet" in {
      scruffy.greet(leela) shouldNot beEmpty
    }
  }

  "A Lady" should {
    "be a Female" in {
      mom.sex shouldEqual(Sex.Female)
    }

    "know how to greet" in {
      mom.greet(leela) shouldNot beEmpty
    }
  }

  "A Granny" should {
    "be a Female" in {
      crazyold.sex shouldEqual(Sex.Female)
    }

    "know how to greet" in {
      crazyold.greet(leela) shouldNot beEmpty
    }

    "know how to knit" in {
      crazyold.knit(leela).color shouldEqual Color.Red
      crazyold.knit(prof).color shouldEqual Color.Blue
    }
  }
}
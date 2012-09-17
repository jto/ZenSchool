package test

import org.specs2.mutable._

import provided._
import provided.Helpers._
import exercices.Classes._

class ClassesSpec extends Specification {

  def prof: Man = new Man(firstname = "Hubert", lastname = "Fansworth", age = 160)
  def leela: Woman = new Woman(firstname = "Leela", lastname = "Turanga", age = 27)
  def scruffy: Gentleman = new Gentleman(firstname = "Scruffy", lastname = "Thejanitor", age = 42)
  def mom: Lady = new Lady(firstname = "??", lastname = "??", age = 170)
  def crazyold: Granny = new Granny(firstname = "Crazy old cat woman", lastname = "??", age = 140)

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
      scruffy.greet(leela) must not be empty
    }
  }

  "A Lady" should {
    "be a Female" in {
      mom.sex shouldEqual(Sex.Female)
    }

    "know how to greet" in {
      mom.greet(leela) must not be empty
    }
  }

  "A Granny" should {
    "be a Female" in {
      crazyold.sex shouldEqual(Sex.Female)
    }

    "know how to greet" in {
      crazyold.greet(leela) must not be empty
    }

    "know how to knit" in {
      crazyold.knit(leela).color shouldEqual Colors.Red
      crazyold.knit(prof).color shouldEqual Colors.Blue
    }
  }
}
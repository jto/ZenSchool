package test

import org.specs2.mutable._

import provided._
import provided.Helpers._
import exercices.Classes._

class ClassesSpec extends Specification {

  def prof: Man = TODO //new Man(firstname = "Hubert", lastname = "Fansworth", age = 160)
  def leela: Woman = TODO //new Woman(firstname = "Leela", lastname = "Turanga", age = 27)
  def scruffy: Gentleman = TODO //new Gentleman(firstname = "Scruffy", lastname = "Thejanitor", age = 42)
  def mom: Lady = TODO //new Lady(firstname = "??", lastname = "??", age = 170)
  def crazyold: Granny = TODO //new Granny(firstname = "Crazy old cat woman", lastname = "??", age = 140)

  "A Man" should {
    "be a Male" in {
      TODO
      success
      // prof.sex shouldEqual(Sex.Male)
    }
  }

  "A Woman" should {
    "be a Female" in {
      TODO
      success
      // leela.sex shouldEqual(Sex.Female)
    }
  }

  "A Gentleman" should {
    "be a Male" in {
      TODO
      success
      // scruffy.sex shouldEqual(Sex.Male)
    }

    "know how to greet" in {
      TODO
      success
      // scruffy.greet(leela) shouldNot beEmpty
    }
  }

  "A Lady" should {
    "be a Female" in {
      TODO
      success
      // mom.sex shouldEqual(Sex.Female)
    }

    "know how to greet" in {
      TODO
      success
      // mom.greet(leela) shouldNot beEmpty
    }
  }

  "A Granny" should {
    "be a Female" in {
      TODO
      success
      // crazyold.sex shouldEqual(Sex.Female)
    }

    "know how to greet" in {
      TODO
      success
      // crazyold.greet(leela) shouldNot beEmpty
    }

    "know how to knit" in {
      TODO
      success
      // crazyold.knit(leela).color shouldEqual Color.Red
      // crazyold.knit(prof).color shouldEqual Color.Blue
    }
  }
}
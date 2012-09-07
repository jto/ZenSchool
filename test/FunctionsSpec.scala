package test

import org.specs2.mutable._

import provided._
import exercices.Functions._

class FunctionsSpec extends Specification {

  "add" should {
    "be appliable" in {
      add(1,2)
      add.apply(1,2)
      success
    }

    "return the sum of 2 Int" in {
      add(1,2) shouldEqual(3)
    }
  }

  "add2" should {
    "be appliable" in {
      add2(1)
      add2.apply(2)
      success
    }

    "add 2 to provided Int" in {
      add2(1) shouldEqual(3)
    }
  }

  "addAnythingBuidler" should {
    "build functions" in {
      val f: (Int => Int) = addAnythingBuidler(2)
      success
    }

    "2 + 4 == 6" in {
      addAnythingBuidler(2)(4) shouldEqual(6)
    }
  }

  "addII" should {
    "be appliable" in {
      addII(1)
      addII.apply(2)
      success
    }

    "add 2 to provided Int" in {
      addII(1) shouldEqual(3)
    }
  }

}
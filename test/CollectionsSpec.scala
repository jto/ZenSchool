package test

import org.specs2.mutable._

import provided._
import exercices.Collections._

class CollectionsSpec extends Specification {

  val xs = (1 to 10).toList
  val xsPlus2 = (1 + 2 to 10 + 2).toList

  "uglysum" should {
    "Compute the sum of a list of Int" in {
      uglysum(xs) shouldEqual(55)
    }
  }

  "sum" should {
    "Compute the sum of a list of Int" in {
      sum(xs) shouldEqual(55)
    }
  }

  "add2toAlll" should {
    "Add 2 to all elements in the List" in {
      add2toAlll(xs) shouldEqual(xsPlus2)
    }
  }

  "addToAll" should {
    "Add the provided Int to all elements in the List" in {
      addToAll(xs)(2) shouldEqual(xsPlus2)
    }
  }

  "nicelyAdd2ToAll" should {
    "Add 2 to all elements in the List" in {
      nicelyAdd2ToAll(xs) shouldEqual(xsPlus2)
    }
  }

  "map" should {
    "Apply the provided function to all elements" in {
      val r = _root_.exercices.Collections.map(x => x + 2)(xs)
      r shouldEqual(xsPlus2)
    }
  }

  "add2ToAllAgain" should {
    "Add 2 to all elements in the List" in {
      add2ToAllAgain(xs) shouldEqual(xsPlus2)
    }
  }

  "reduce" should {
    "do what reduce does" in {
      val reduced = reduce(_ + _)(xs)
      reduced shouldEqual(55)
    }
  }

  "fold" should {
    "do what fold does" in {
      val folded = fold(_ + _, 0)(xs)
      folded shouldEqual(55)
    }
  }

  "reduceByFolding" should {
    "do what reduce does" in {
      val reduced = reduceByFolding(_ + _)(xs)
      reduced shouldEqual(55)
    }
  }

  "mapByFolding" should {
    "Apply the provided function to all elements" in {
      val r = mapByFolding(_ + 2)(xs)
      r shouldEqual(xsPlus2)
    }
  }

}
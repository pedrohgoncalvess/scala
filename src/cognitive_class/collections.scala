package cognitive_class

import scala.collection.SortedSet

object collections extends App {
  //types collections
  //map
  //set
  //seq > indexedseq > vector
  //seq > linearseq > list
  //seq > array

  //INDEXEDSEQ
  println("===========INDEXEDSEQ===========")

  val oneToTeen = 1 to 10
  val arrayInt: IndexedSeq[Int] = oneToTeen.map(n => n + 1)
  arrayInt.foreach(println)

  //SETS COLLECTIONS

  println("===========SETS===========")
  var set = scala.collection.mutable.Set[Int]()
  val setInt = Set(0, 2, 3, 4, 5, 7, 9, 12)
  set += 3 //append with one value
  set ++= setInt //concatenate a set
  println(set)
  println(set(1)) //don't access the index, set try when looping through the set to find the value
  val setOrdened = SortedSet(1, 5, 4, 4, 5, 7, 2, 10, 9, 8, 8)
  println(setOrdened)

  //LIST COLLECTIONS
  println("===========LIST===========")

  val listOne = List(1, 2, 3, 4, 5)
  val listTwo = List(1, 5, 9, 8)
  val listComplet = listOne ++ listTwo //you can concatenate list using ++

  println(listComplet) //foreach is a function defined in trait TRAVERSABLELIKE. all collections inherit TRAVERSABLELIKE functions

  val listIntSecond = 1 :: 3 :: 3 :: 4 :: 5 :: 6 :: 5 :: 4 :: 7 :: Nil
  println(listIntSecond.distinct) //no need to transform to set to remove duplicate values. distinct method can do

  val listDifOrd = listOne +: listTwo //concatenate with different ord
  println(listDifOrd)
  val listDifOrd2 = listOne :+ listTwo
  println(listDifOrd2) //add full list (with list() sintax)

  listOne match { // ::
    case head :: tail => println(head)
    case _ =>
  }

  def printList(list: List[Int]): Unit = {
    list match {
      case head :: Nil =>
        println(head)
      case head :: tail => //::
        println(head)
        printList(tail)
    }
    printList(List(1, 2, 4, 3, 5))
  }


  //=========TUPLES=========
  //TUPLES ACCEPTS DUPLICATE VALUES
  println("===========TUPLES===========")


  val casal = ("Pedro","Emilly","Pedro")
  val descompact = ("Primeiro","Segundo")
  val (first,sec) = descompact
  println(casal)
  println(casal.getClass)

  descompact match {
    case (first1,sec1) => println(s"First $first1 and second $sec1")
  }

//  val planets =
//    List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
//      ("Mars", 227.9), ("Jupiter", 778.3))
//  planets.foreach {
//    case ("Earth", distance) =>
//      println(s"Our planet is $distance million kilometers from the sun") //IF LOOPING THROUGH
//    case _ =>
//  }


  //=========MAPS=========

  println("===========MAPS===========")

  val services = Map( //best method to create a map(dict)
    "Busca" -> "Best hotels",
    "Prices" -> "20"
  )

  val services2 = Map( //alternative method to create a map(dict)
    ("Busca","Best hotels"),
    ("Prices","20"),
  )

  println(services==services2)
  println(services("Busca")) //access the value with key
  println(services2.get("Busca")) //alternative method to acces the value
  println(services.getOrElse("Prices","Dont have price"))

  val newServices = services + ("Name" -> "San Thiago Hotel") //add new key and value
  println(newServices)

  val reduceServices = newServices - "Busca" //remove key and value
  println(reduceServices)
}
package cognitive_class

object collections extends App {
  //types collections
  //map
  //set
  //seq > indexedseq > vector
  //seq > linearseq > list
  //seq > array

  val oneToTeen = 1 to 10
  val arrayInt = oneToTeen.map(n => n+1)
  arrayInt.foreach(println)

}
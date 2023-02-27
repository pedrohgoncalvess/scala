package Lectures.basics.OOP

object OOBasics extends App {

  val person = new Person("Pedro",20)

  println(person.age)
  //println(person.name) class parameters ARE NOT fields
  println(person.x) //EXAMPLE
  println(person.apresentationPerson("Pedro"))


  val author = new Writer("Tedd", "Codd", 1923)
  val novel = new Novel("Databases", 1970,author)

  println(author.fullName)
  println(novel.authorAge)

  val counter = new Counter
  counter.inc.print

}


class Person(val name:String, val age:Int)  { //CONSTRUCTOR
  val x:Int = 2

  def apresentationPerson(name:String): Unit = {
    println(s"$this says. Hello $name") //this.field == self.field
  }
}

class Writer(firstName:String, surName:String, val yearBorth: Int) {
  def fullName: String = firstName + " " + surName
}

class Novel(name:String, yearRelease: Int, authorNovel: Writer) {
  def authorAge: Int = yearRelease - authorNovel.yearBorth
}

class Counter(val count: Int = 0) {
  def inc = {
    println("Incrementing")
    new Counter(count + 1) //immutability
  }

  def dec = {
    println("Decremeting")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }
  def print = println(count)
}



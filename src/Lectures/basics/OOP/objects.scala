package Lectures.basics.OOP

object objects extends App {

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")

  object Person { //type + its only instance
    //"static"/"class" - level functionality
    val N_EYES = 2
    val canFly: Boolean = false
    def apply(mother: Person, father: Person): Person = {new Person("Bobbie")}
  }
  class Person(val name:String) {

  }

  println(Person.N_EYES)
  println(Person.canFly)

  //SCALA OBJECT = SINGLETON INSTANCE

  val person2 = Person
  val person1 = Person
  val pedro = new Person("Pedro")
  val emilly = new Person("Emilly")

  println(emilly == pedro)
  println(person1 == person2)

  val bobbie = Person(pedro,emilly) //apply dont need callback method name
}

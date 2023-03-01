package Lectures.basics.OOP

object methodNotations extends App{

  class Person(val name: String, favoriteMovie: String, val age:Int = 0) {

    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickName: String): Person = new Person(s"$name ($nickName)", favoriteMovie)
    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive : Boolean = true
    def apply(): String = s"Hi, my name is $name and i like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

    def learns(thing:String): String = {s"$name is learning $thing"}
    def learningScala = this learns "scala"
  }

  val pedro = new Person("Pedro","Intocaveis")
  println(pedro.likes("Intocaveis"))
  println(pedro likes "Intocaveis")
  // infix notation = operator notation

  //"operators" in scala
  val emilly = new Person("Emilly", "Branquelas")
  println(pedro + emilly)

  //unary
  println(pedro.unary_!)
  println(1.unary_+)
  println(!emilly)

  //apply
  println(pedro.apply())
  println(pedro()) //equivalent

  println((pedro+"scala dev")())
  println((+pedro).age)

  //callback other method with scala parameter
  println(pedro.learns("python"))
  println(pedro.learningScala)

  //apply with parameter
  println(pedro(10))
}

package cognitive_class

object classes extends App{

  val pedro = new Hello("Testing classes")
  println(pedro.printMessage)

  val name:String = "Pedro Henrique Gonçalves"
  val splitNotSugar:Array[String] = name.split(" ")
  val splitSugar:Array[String] = name split " "



  println(splitNotSugar.mkString(sep="," ))
  println(splitSugar.mkString(sep=","))
}

class Hello(message:String) {

  def printMessage:String = s"User message is: $message"

}

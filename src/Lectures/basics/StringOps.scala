package Lectures.basics

object StringOps extends App {

  val str: String = "I am trying to Turn a data eng"

  println(str.charAt(5)) //ACCESS A CHARACTER BY INDEX
  println(str.substring(7,11)) //"CUT" THE STR BY INDEX *DONT NEED END INDEX
  println(str.split(" ").toList) //TRANSFORM IN LIST BASED IN SEPARATOR *NECESSIT .toList
  println(str.replace(" ","-")) //REPLACE CHARS
  println(str.toLowerCase) //TRANSFORM IN LOWER ALL CHARS AT STRING
  println(str.length) //RETURN LENGTH OF STRING
  println(str.reverse) //REVERSE STRING
  println(str.take(4)) //TAKE THE FIRST FOUR CHARS AT STRING

  val numberString = "45"
  val aNumber = numberString.toInt //CONVERT TYPE
  println(aNumber.getClass)

  //S-interpolators //WRITE STRINGS

  val name:String = "Pedro"
  val age:Int = 12
  val apresentation:String = s"Hello, my name is $name and I am $age years old"
  val apresentationAlt:String = s"Hello, my name is $name and I will be turning ${age + 1} years old"

  println(apresentation)
  println(apresentationAlt)

  //F-interpolators

  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  //raw-interpolator

  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")



}

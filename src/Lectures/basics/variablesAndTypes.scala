package Lectures.basics

object primitiveTypes extends App{

  val valIntImplicit = 42
  val valIntExplicit:Int = 24
  println(valIntImplicit)
  println(valIntExplicit)

  //VALS ARE IMMUTABLE

  //COMPILER CAN INFER TYPES

  val aName: String = "Pedro"; val aName2 = "Henrique" //DENOMINE 2 OR MORE VARIABLES INLINE

  val valBool: Boolean = true //LOWER CASE != PYTHON

  val valChar: Char = 'a' //ONE CHARACTER

  val valAnotherVal: Int = valIntImplicit //VAL WHAT VARIABLE THAT STORES ANOTHER VARIABLE

  val valShortNumber: Short = 9999 ///MAX NUMBER IS 9999 (4 DIGITS)

  val valLongNumber: Long = 4986469484797498L //L IN END OF NUMBER

  val valFloat: Float = 2.0f //F IN END OF NUMBER

  val valDouble: Double = 3.14 //DONT NEEDS F IN END OF NUMBER


}

object VariablesTypes extends App {

  var valVariable: Int = 4
  valVariable = 12

  //VAR ARE MUTABLES
}

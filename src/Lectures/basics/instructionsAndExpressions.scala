package Lectures.basics

object Expressions extends App {

  val x = 1 + 2 //EXPRESSIONS
  println(x)
  println(2 + 3 * 4)

  println(1 == x) //EQUALS

  println(!(1 == x)) //NOT EQUALS ! IS "DIFFERENT" OR "NOT" OPERATOR

  var valVariableAdds:Int = 2
  valVariableAdds += 5


  // INSTRUCTIONS (DO) VS EXPRESSIONS (VALUE)
  //IF EXPRESSION

  val valCondition = true
  val valConditionedValue = if(valCondition) 5 else 3 //IF EXPRESSION
  println(valConditionedValue)
}

object Loops extends App {

  var i = 0
  while (i < 10) {
    println(i)

  i += 1
  }
  //NEVER DO THIS.
  //EVERYTHING IN SCALA IS AN EXPRESSION
  //SIDE EFFECTS: println(), while, reassigning

  val valBlockExpression = {
    val x:Int = 10
    val y = x + 10

    if (y < 20) "hello" else "goodbye"
  }

  println(valBlockExpression)
}
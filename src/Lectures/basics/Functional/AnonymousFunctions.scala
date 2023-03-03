package Lectures.basics.Functional

object AnonymousFunctions extends App{

  //anonymous function (LAMBDA)
  val doubler = (x: Int) => x * 2

  //multiple params in a lambda
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  //no params
  val justDoSomething: () => Int = () => 3

  //println(justDoSomething())

  val superAdd = (x:Int) => (y:Int) => x + y
  println(superAdd(3)(4))

}

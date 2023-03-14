package Lectures.basics.Functional


object HOFsCurries extends App {
  val superFunction: (Int,(String,(Int => Boolean)) => Int) => (Int => Int) = null
  //high order function (HOF)

  //map, flatmap, filter in mylist

  //function that applies a function n time over a value x
  //ntimes(f,n,x)
  //ntimes(f,3,x) = f(f(f(x))) = ntimes(f,2,f(X)) = f(f(f(x)))

  def nTimes(f:Int => Int, n:Int, x:Int): Int =
    if (n<=0) x
    else nTimes(f,n-1,f(x))

  val plusOne = (x:Int) => x + 1
  println(nTimes(plusOne,10,1))
  println(plusOne(1))

  val expoTwo = (x:Int) => x * x
  def HOfunction(aFunction:Int=>Int,x:Int): Int = {
    val expoTwoResult = aFunction(x)+2
    expoTwoResult
  }
  println(HOfunction(expoTwo,5))

  //nTimesBetter(f,n) = x => f(f(f...(x)))
  //increment10 = nTimesBetter(plusOne,10) = x => plusOne(plusOne....(x))
  // val y = increment10(1)
  def nTimesBetter(f: Int => Int, n:Int): (Int => Int) =
    if (n <= 0 ) (x: Int) => x
    else (x: Int) => nTimesBetter(f,n-1) (f(x))

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))

  //curried functions
  val superAdder: Int => (Int => Int) = (x:Int) => (y:Int) => x + y
  val add3 = superAdder(3)
  println(add3(10))
  println(superAdder(3)(10))

  //functions with multiple parameter lists
  def curriedFormatter(c: String) (x: Double): String = c.format(x)

  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat: (Double => String) = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))
}

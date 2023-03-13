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

}

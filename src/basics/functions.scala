package basics


object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Pedro", 20))

  def ParameterlessFunction(): Int = 40

  println(ParameterlessFunction())

  def repeatFunction(text: String, n: Int): String = {
    println("====Recursive Function====")
    if (n == 1) text
    else text + repeatFunction(text, n - 1)
  }

  println(repeatFunction("Pedro", 3))
  //RECURSIVE FUNCTION

  //  def functionWithSideEffect(text: String): Unit = println(text)
  //  functionWithSideEffect("Friendo")
  //
  //
  //  ///AGRUPPATE FUNCTION
  //  def aggrupateBigFunction(n: Int): Int = {
  //    def smallFunction(a: Int, b:Int): Int = a + b
  //    smallFunction(n,n-1)
  //  }
  //  println(aggrupateBigFunction(5))

  ///APRENSENTATION FUNCTION
  def nameAndYear(name: String, year: Int): String = {
    val personalInformation: String = "My name is " + name + " and i'm " + year + " years old"
    personalInformation
  }

  println(nameAndYear("Pedro", 20))

  def Factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * Factorial(n - 1)

  }

  println(Factorial(5))

  def Fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else Fibonacci(n - 1) + Fibonacci(n - 2)
  }

  println(Fibonacci(8))
}


//  def isPrime(n: Int): Boolean = {
//    def isPrimeUntil(t:Int): Boolean = {
//      if (t <= 1) true
//      else n % t != 0 && isPrimeUntil(t-1)
//
//      isPrimeUntil(n / 2)
//    }
//  }
//}



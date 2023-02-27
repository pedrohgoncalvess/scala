package Lectures.basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computing factorial of " + n)

      result
    }
  }

  //factorial(10)

  def Factorial(n: Int): BigInt = {
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)

    factorialHelper(n, 1) //TAIL RECURSION = use recursive call as the LAST expression
  }
  //println(Factorial(50000))

  //WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION

  def concatenateTailRec(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatenateTailRec(aString, n - 1, aString + accumulator)
  }

  println(concatenateTailRec("Pedro", 3, ""))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailRec(n / 2, true)
  }
  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n:Int): Int = {
    def fiboTailRec(i: Int, last:Int, nextToLast:Int): Int = {
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)
    }
    if (n <= 2) 1
    else fiboTailRec(3, 1, 1)
    }
  println(fibonacci(8))
}
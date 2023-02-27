package Lectures.basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFact(n-1, n*acc)
  }
  val fact10 = trFact(10,2)

  def saveArchive(format:String = "xlsx", size:String = "1 Mb", quant:Int = 1) = {
    println("The archive(s) " + quant + " with format " + format + " and size " + size
    + "")
  }

  val defaultArguments = saveArchive()
  val namedArguments = saveArchive(size = "5 kb", quant = 2, format = "jpeg")

  println(defaultArguments)
  println(namedArguments)
}
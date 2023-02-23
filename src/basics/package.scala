package basics

import java.text.SimpleDateFormat
import java.util.Calendar
import scala.annotation.tailrec

object TimeTest extends App{
  def main(stage: String): String = {
    val format = new SimpleDateFormat("ss.SSS a")
    val Datetime = format.format(Calendar.getInstance().getTime())

    Datetime
  }
  @tailrec //informe compiler this is a tail recursive function
  def testPerfomance(startInt:Int): BigInt = {
    if (startInt == 0) 0
    else {
      //println(startInt)
      testPerfomance(startInt-1)
    }
  }
  val aInicio = main("Inicio")
  testPerfomance(1000000000)
  val aFinal = main("Final")
  println(aInicio, aFinal)
}

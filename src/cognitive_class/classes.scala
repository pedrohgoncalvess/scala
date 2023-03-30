package cognitive_class

object classes extends App{

  val time = Time(10,30)

  println(Time.unapply(time)) //UNAPPLY METHOD !DESCOMPACT CLASS.

  val pedroReverse = Reverse("Pedro")

  println(pedroReverse) //APPLY METHOD REPRESENTATION

  val timeCopy = time.copy(minutes = 5)
  println(timeCopy.toString)
  println(s"$time is the primary and $timeCopy is the copy of the time.hour and set minutes")

}

case class Time(hour:Int,minutes:Int)
object Reverse { //APPLY METHOD I THINK THE PRIMARY FUNCTION MUST HAVE NAME APPLY.
  def apply(s:String): String = {
    s.reverse
  }
}
import java.util.regex.{Matcher, Pattern}

/**
 * Created by Darcklight on 12/5/2014.
 */
object Tester_for_Becnhmark extends App{

  val pat:Pattern =Pattern.compile("[0-9]+:[0-9]+$")
  val pat2:Pattern =Pattern.compile("[0-9]+")
  val s = "0995450041:023"
  var timebefor = System.nanoTime()
  var i = 0;
  while (i < 1000) {

    val m:Matcher = pat.matcher(s)
    m.matches()
    val b = s.split(":")
    i+=1
  }
  var timeafter= System.nanoTime()
  println("benchmark = " + (timeafter-timebefor)/1000+ " ns")

  var timebefor2 = System.nanoTime()
  var j = 0;
  while (j < 1000) {
    val b = s.split(":")
    for (a <- b) {
    val m: Matcher = pat2.matcher(a)
    m.matches()
  }
    j+=1
  }
  var timeafter2= System.nanoTime()
  println("benchmark = " + (timeafter2-timebefor2)/1000+ " ns")

}








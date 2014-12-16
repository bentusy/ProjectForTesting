/**
 * Created by Administrator on 16.12.2014.
 */
import scala.collection.mutable.Map

object testSimply extends App{


  val m = Map[String, String]()
 m += ("1" -> "ss")
  m--=(Array("1","2"))
  m-="1"
  println("all ok")
}

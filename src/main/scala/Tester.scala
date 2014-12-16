import java.text.{SimpleDateFormat, DateFormat}
import java.util.Calendar



import akka.actor.Actor.Receive
import akka.actor.ActorRef

import scala.collection.immutable.TreeMap
import scala.collection.mutable._

import akka.actor._
import akka.actor.SupervisorStrategy._
//import akka.dispatch.sysmsg._
import akka.io.{IO, Tcp}
import akka.util.ByteString
import java.net.InetSocketAddress
import scala.util.Properties.{lineSeparator => newLine}
import scala.concurrent._
import scala.concurrent.duration._
import akka.pattern.ask
import scala.collection.mutable.Queue

import akka.util.Timeout
import scala.concurrent.ExecutionContext.Implicits.global

import akka.actor.ActorRef
import java.sql.{Connection, DriverManager, ResultSet}

import scala.collection.Map




object CallAlign extends App {
  // Change to Your Database Config
  val conn_str = "jdbc:mysql://10.0.1.7:5432/postgres?user=postgres&password=123456"
  // Load the driver
  classOf[org.postgresql.Driver]
  var conn: Connection = null;

  def connect: Unit = {
    conn = DriverManager.getConnection(conn_str)
  }

  def disconect: Unit = {
    conn.close
  }

  def createSt: Unit = {
    val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
  }

  while (true) {
    var s = Console.readLine()
    if (s == "c") connect
    if (s == "d") disconect
    if (s == "cr") createSt
    if (s == "e") System.exit(0)
  }
}
//
//
////  var contacts:ArrayBuffer[String]= ArrayBuffer("1", "2", "3", "4")
////  id="2"
////  contacts.remove(contacts.indexOf(id))
////  println(contacts)
//
//
//  val regContatcs:Map[String, String]= Map()
////  var i =0
////  while(i<20){
////    i+=1
////    regContatcs.+=(i.toString -> ("didi"+i.toString))
////    }
////  println(regContatcs)
////  val regCon:ArrayBuffer[String]= ArrayBuffer()
////var a =0
////  while(a<10){
////    a+=1
////    regCon += (a.toString)
////  }
////  println(regCon)
////  regContatcs.--= (regCon)
////  for(i <- 1 to 500){
////
////    regContatcs.+=(i.toString -> ("didi"+i.toString))
////  }
////val t1 = System.nanoTime()
////println(regContatcs)
////
////  for(i <- 1 to 500){
////
////    if(regContatcs.contains("1")){
////      regContatcs.-=("1")
////    }
////  }
////val t2 = System.nanoTime()
////println("Benchmark += "+((t2-t1)/500))
////
////
////  val t3 = System.nanoTime()
////  println(regContatcs)
////  regContatcs -=("1")
//////regContatcs.clear()
////  for(i <- 1 to 500){
////    regContatcs -=("1")
////  }
////  val t4 = System.nanoTime()
////  println("Benchmark remove nonexist element "+((t4-t3)/500))
//val system = ActorSystem("hostsystem")
//  //
//  //  val endpoint = new InetSocketAddress("localhost", 9901)
//  //  // conf it
//  var timebefor = System.nanoTime()
//  var i = 0;
//  while (i < 500) {
//    system.actorOf(Props(new T), name = "tcp"+i)
//    i+=1
//  }
//  var timeafter= System.nanoTime()
//  println((timeafter-timebefor)/500)
//  //var s =  system.actorOf(TCPServerA.props(endpoint), name = "tcpsss"+i)
//  //
//  var map:Map[Int, t2] = Map()
//  var a = 0;
//  var timebefor1= System.nanoTime()
//  while (a < 500) {
//    map +=(a -> new t2())
//    a+=1
//  }
//  var timeafter1= System.nanoTime()
//  println((timeafter1-timebefor1)/500)
//
//
//}
//
//class Intent(idCreatorc: String, timeToDiec: String ) extends Ordered[Intent] {
//
//  val idCretor = idCreatorc
//
//
//  val dateToDie:Calendar = convertStringToCalendar(timeToDiec)
//println(idCretor+" "+convertCalendarToString(dateToDie))
////  dateToDie.add(Calendar.HOUR, timeToDiec.toInt)
//
//
//  def convertStringToCalendar(str: String): Calendar={
//  println("befor convrt " +str)
//    val df:DateFormat = new SimpleDateFormat("yyyy.MM.dd_HH:mm");
//    val cal:Calendar  = Calendar.getInstance();
//    val a = df.parse(str)
//    cal.setTime(a);
//    println("after convert "+convertCalendarToString(cal))
//    cal
//  }
//
//  def convertCalendarToString(cal: Calendar): String={
//    val df:DateFormat = new SimpleDateFormat("yyyy.MM.dd_HH:mm");
//
//    df.format(cal.getTime)
//  }
//
//  override def compare(that: Intent): Int ={
//   this.dateToDie.compareTo(that.dateToDie)
//  }
//
//
//
////  system.actorOf(Props(new UserManager()), name = "usermanager")
////
////  Console.readLine()
////  system.shutdown()
//
//}
//
//class T extends Actor{
//
//
//  override def receive: Receive = {
//
//    case _ => {
//      print("s")
//    }
//  }
//
//
//}
//
//class t2 {
//
//}
import java.sql.{ResultSet, DriverManager, Connection}
import java.util.Calendar

/**
 * Created by Darcklight on 12/5/2014.
 */
object Tetstr2{


  def main(args: Array[String]): Unit = {

    val b ="74//"
    println(b.split("/").length)

  }
//    // Change to Your Database Config
//    val conn_str = "jdbc:postgresql://94.45.133.18:5432/callalign?user=postgres&password=artemcom"
//    // Load the driver
//    classOf[org.postgresql.Driver]
//    var conn: Connection = null;
//
//    def connect: Unit = {
//      conn = DriverManager.getConnection(conn_str)
//    }
//
//    def disconect: Unit = {
//      conn.close
//    }
//
//    def createSt(s: String): Unit = {
//      val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
//      try {
//        val prep = conn.prepareStatement("INSERT INTO intents (id, idCreator, idDestination, dateToDie) VALUES (?, ?, ?, ?)")
//        prep.setString(1, s)
//        prep.setString(2, s)
//        prep.setString(3, s)
//        prep.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()))
//        prep.executeUpdate
//        println("Вроде сохранило")
//      }
//      finally {
//        conn.close
//      }
//    }
//
//    def call(s: String): Unit ={
//      var callableStatement = conn.prepareCall("SELECT set_contacts(?, ?)");
//      val simpleContacts= Array[String]("ssss","2222","zzzzz")
//      callableStatement.setArray(2, conn.createArrayOf("text", simpleContacts.asInstanceOf[Array[AnyRef]]))  ////// Если это запуститься то можеш пол часа отдохнуть.!!!
//      callableStatement.setString(1, "a2")
//      callableStatement.execute();
//    }
//
//
//    def pr(): Unit = {
//      val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
//      try {
//
//        val resultSet = statement.executeQuery("SELECT * FROM users")
//        resultSet.next()
//        print(resultSet.getString("id"))
//        println("sss")
//       }
//      finally {
//        conn.close
//      }
//    }
//
//    while (true) {
//      var s = Console.readLine()
//      if (s == "c") connect
//      if (s == "d") disconect
//      if (s == "cr") createSt(Console.readLine())
//      if (s=="p") pr
//      if (s == "e") System.exit(0)
//      if (s == "cl") call(Console.readLine())
//    }
//  }

}

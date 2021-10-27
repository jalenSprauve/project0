package project0
import scala.util.Random
import java.sql.DriverManager
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.SQLException
import scala.collection.mutable.ArrayBuffer

object displayR extends App {

  def dis ():Int= {
    // connect to the database named "project0" on the localhost


    val driver = "com.mysql.cj.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "Butter3030$"

    var connection:Connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement()
    val resultSet = statement.executeQuery("SELECT max(id)  FROM activity;")
   // val randomdex = statement.executeQuery("SELECT max(id)  FROM activity;")
    //println(randomdex.getString(1))
    //println(resultSet)
    //while ( resultSet.next() ) {
     // println(resultSet.getString(1)+", " +resultSet.getString(2) +", "+resultSet.getString(3)+"," +resultSet.getString(4))
    resultSet.next()
    var mas= (resultSet.getString(1)).toInt

    //}

    connection.close()
    return mas
  }
  def disR (mas:Int):Unit= {
    var num =mas
    val r = scala.util.Random
    //var rnn = r.nextInt(num)
    var randomnum= 1 + r.nextInt( num)
    // connect to the database named "project0" on the localhost


    val driver = "com.mysql.cj.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "Butter3030$"

    var connection:Connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement()
    var resultSet = statement.executeQuery(s"SELECT *  FROM activity where id=$randomnum;")
     resultSet.next()
    println(resultSet.getString(1)+", " +resultSet.getString(2) +", "+resultSet.getString(3)+"," +resultSet.getString(4))
    connection.close()
  }
 var massy =dis()
 // print(massy)

  disR(massy)
}
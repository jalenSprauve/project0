package project0
import java.sql.DriverManager
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.SQLException
import scala.collection.mutable.ArrayBuffer

object addR extends App {
  def adds(idn:Int,act:String,ph:String,addy:String) {
  // connect to the database named "test" on the localhost
    var acts= act
    var phNum =ph
    var addr =addy
    var id =idn
  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost:3306/project0"
  val username = "root"
  val password = "Butter3030$"

  var connection:Connection = DriverManager.getConnection(url, username, password)
  val statement = connection.createStatement()
  statement.execute(s"insert into activity(id,event,phonenumber,address) values ($id,\"$acts\",\"$phNum\",\"$addr\");")
  connection.close()
  }
  adds(12,"go-karts","(786) 838-0612","8600 NW South River Dr, Medley, FL 33166")
}
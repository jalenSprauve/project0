package project0
import java.sql.{Connection, DriverManager}

object removeR extends App{
  def rmvs(idn:Int) {
    // connect to the database named "test" on the localhost
    var id =idn
    val driver = "com.mysql.cj.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "Butter3030$"

    var connection:Connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement()
    statement.execute(s"delete from activity where id= $id;")
    connection.close()
  }
  rmvs(12)
}

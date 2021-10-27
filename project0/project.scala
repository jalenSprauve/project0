package project0
import java.lang.NumberFormatException
import scala.io.StdIn.readInt


object project extends App {
 var userin:Int=0
  def menu(): Int = {
    println("1:add activity")
    println("2:remove activity")
    println("3:display random activity")
    println("0: End program")
    println("choose one")

    try{
     userin = readInt()
      return userin
    }catch {
      case e: NumberFormatException => 0
    }
  }

  def menuSwitch(i: Int): Unit = {
    i match {

      case 1 => var rando =displayR.dis()+1

        var an = scala.io.StdIn.readLine("enter the activity name")
        var apn = scala.io.StdIn.readLine("enter the event phone number")
        var aa= scala.io.StdIn.readLine("enter the event address")
        addR.adds(rando,an,apn,aa)

      case 2 => println("enter the id# of the activity you want to remove")
        try{
          var rm = readInt()
        removeR.rmvs(rm)
        }
          catch{ case r:NumberFormatException => 0}
      case 3 => {var rand =displayR.dis()
      displayR.disR(rand)}
      case _ => {}
    }
  }

  def menuloop(): Unit = {
    var choice = 0
    do {
      choice = menu()
      menuSwitch(choice)
    }
    while (choice != 0)
  }

  menuloop()
}

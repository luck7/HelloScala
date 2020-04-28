import java.text.SimpleDateFormat
import java.util.Date

object TimeConverter {

  def main(args: Array[String]): Unit = {
    //val tm = "2017-08-01 16:44:32"
    val tm = "1970-01-01 00:00:00"
    val a = timeToLong(tm)
    println(a)

    val ms = "0"
    //val ms = "1502036122000"
    val b = timeToString(ms)
    println(b)
  }

  def timeToLong(tm: String): Long = {
    val fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val dt = fm.parse(tm)
    val aa = fm.format(dt)
    val tim: Long = dt.getTime()
    tim
  }

  def timeToString(tm: String): String = {
    val fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val tim = fm.format(new Date(tm.toLong))
    tim
  }
}
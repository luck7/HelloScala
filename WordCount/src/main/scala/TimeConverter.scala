import java.text.SimpleDateFormat
import java.util.Date

object TimeConverter {

  def main(args: Array[String]): Unit = {
    val tm = "2017-08-01 16:44:32"
    val a = timeToMs(tm)
    println(a)

    val ms = "1502036122000"
    val b = msToString(ms)
    println(b)
  }

  /** *
   * 转为毫秒
   *
   * @param tm 格式：yyyy-MM-dd HH:mm:ss
   * @return
   */
  def timeToMs(tm: String): Long = {
    val fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val dt = fm.parse(tm)
    val tim: Long = dt.getTime()
    tim
  }

  /** *
   * 转为时间字符串
   *
   * @param tm
   * @return 格式：yyyy-MM-dd HH:mm:ss
   */
  def msToString(tm: String): String = {
    val fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val tim = fm.format(new Date(tm.toLong))
    tim
  }
}
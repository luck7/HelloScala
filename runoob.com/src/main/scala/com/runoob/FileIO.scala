import java.io._
import scala.io._
import scala.io.Source

object FileIOTest {
    def main(args: Array[String]) {
        // 文件IO
        val writer = new PrintWriter(new File("test.txt" ))
        writer.write("菜鸟教程")
        writer.close()

        // 屏幕读取输入
        print("请输入菜鸟教程官网 : " )
        val line = StdIn.readLine()
        println("谢谢，你输入的是: " + line)

        // 文件读取
        println("文件内容为:" )
        Source.fromFile("test.txt" ).foreach{ 
            print 
        }
    }
}
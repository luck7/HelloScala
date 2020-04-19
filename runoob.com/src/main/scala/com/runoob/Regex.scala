import scala.util.matching.Regex

object RegexTest {
    def main(args: Array[String]) {
        val pattern = "Scala".r
        val str = "Scala is Scalable and cool"      
        println(pattern findFirstIn str)

        // 首字母可以是大写 S 或小写 s
        val pattern1 = new Regex("(S|s)cala")
        val str1 = "Scala is scalable and cool"
        // 使用逗号 , 连接返回结果
        println((pattern1 findAllIn str1).mkString(","))
        // 替换第一个匹配项
        println(pattern1 replaceFirstIn(str1, "Java"))

        val pattern2 = new Regex("abl[ae]\\d+")
        val str2 = "ablaw is able1 and cool"      
        println((pattern2 findAllIn str2).mkString(","))
    }
}
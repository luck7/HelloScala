import org.apache.spark.{SparkContext, SparkConf}

object WordCount {
  def main(args: Array[String]): Unit = {

    val config: SparkConf = new SparkConf().setMaster("local[3]").setAppName("WordCount")
    val sc = new SparkContext(config)

    val lines = sc.textFile("in")
    val words = lines.flatMap(_.split(" "))
    val wordToOne = words.map((_, 1))
    val wordToSum = wordToOne.reduceByKey(_ + _)
    val tuples = wordToSum.collect()

    tuples.foreach(println)
  }
}

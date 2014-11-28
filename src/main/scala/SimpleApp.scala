import com.typesafe.config.ConfigFactory
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object SimpleApp {
  def main(args: Array[String]) {
    val config = ConfigFactory.load()
    val logFile = "s3n://tw-data-lab/tongda/simpleSparkApp/README.md"
    val conf = new SparkConf()
      .setAppName("Simple Application")
      .setMaster(config.getString("spark-cluster.master"))
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
  }
}
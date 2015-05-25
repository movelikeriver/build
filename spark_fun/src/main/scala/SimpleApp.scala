/* SimpleApp.scala */
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object SimpleApp {
  def main(args: Array[String]) {
    val logFile = "/tmp/sample.log" // Should be some file on your system
    val conf = new SparkConf().setAppName("Simple Application")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()

    val lines = sc.textFile(logFile);
    val lineNum = lines.map(s => 1)
    val totalLines = lineNum.reduce((a, b) => a + b)
    val lineLengths = lines.map(s => s.length)
    val totalLengths = lineLengths.reduce((a, b) => a + b)

    println("Lines with a: %s, Lines with b: %s, Total length: %s lines: %s".format(numAs, numBs, totalLines, totalLengths))
  }
}
package sparkws
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
object count extends App {
  val conf=new SparkConf().setMaster("local").setAppName("count");
  val sparkcontext= new SparkContext(conf);
  println(sparkcontext);
}
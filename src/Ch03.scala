import scala.collection.mutable.ArrayBuffer
import scala.util.Random

/**
  * Created by jimin on 2/17/16.
  */
object Ch03 {

  /**
    * Exercise 01
    *
    * @param n
    */
  def insertChar(n: Int) = {
    val array = new Array[Int](n)
    for (i <- 0 until n) {
      array(i) = Random.nextInt(n)
    }
    println(array.mkString(" "))
  }

  /**
    *
    * @param array
    * @return
    */
  def swapArray(array: Array[Int]) = {
    for (i <- 0 until array.size if i % 2 == 1) {
      val tmp = array(i)
      array(i) = array(i - 1)
      array(i - 1) = tmp
    }
    println(array.mkString(", "))
  }

  /**
    * ### Exercise 03 ###
    *
    * @param array
    * @return
    */
  def swapArrayYield(array: Array[Int]) = {
    for (i <- 0 until array.size) yield {
      if (i % 2 == 1) {
        val tmp = array(i)
        array(i) = array(i - 1)
        array(i - 1) = tmp
      }
    }
    array
  }

  def main(args: Array[String]) {

    println("### Exercise 01 ###")
    insertChar(9)

    println("\n### Exercise 02 ###")
    swapArray(Array(1, 2, 3, 4, 5))

    println("\n### Exercise 03 ###")
    println(swapArrayYield(Array(1, 2, 3, 4, 5)).mkString(", "))

    println("\n### Exercise 05 ###")
    val array = Array(1, 2, 3, 4, 5)
    var sum: Int = 0;
    array.foreach(sum += _)
    val avg = sum / array.size
    println(avg)
  }
}

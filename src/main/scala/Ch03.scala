import scala.util.Random

/**
  * Created by jimin on 2/17/16.
  *
  * Working with Arrays
  */
object Ch03 {

  /**
    * Exercise 02
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
    array
  }

  /**
    * ### Exercise 03 ###
    *
    * @param array
    * @return
    */
  def swapArrayYield(array: Array[Int]): Array[Int] = {
    val newArray = Array.fill(array.size)(0)
    for (i <- 0 until array.size) yield {
      if (i % 2 == 1) {
        newArray(i) = array(i - 1)
        newArray(i - 1) = array(i)
      } else if (i == array.length - 1 && i % 2 == 0) {
        newArray(i) = array(i)
      }
    }
    newArray
  }

  def average(array: Array[Double]): Double = {
    array.sum / array.size
  }

}

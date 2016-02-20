/**
  * Created by jimin on 2/19/16.
  * Higher-Order Functions
  */
object Ch12 {

  /**
    * Exercise 01
    *
    * @param fun
    * @param low
    * @param high
    * @return
    */
  def values(fun: (Int) => Int, low: Int, high: Int) = {
    for (i <- low to high) yield (i, fun(i))
  }

  /**
    * Exercise 02
    *
    * @param array
    * @return
    */
  def largestElement(array: Array[Int]) = {
    array.reduceLeft(_ max _)
  }

  /**
    * Exercise 3
    *
    * @param n
    * @return
    */
  def factorialNoLoop(n: Int) = {
    if (n == 0) 1
    else if (n < 0) 0
    else {
      (1 to n).reduceLeft(_ * _)
    }
  }

  def main(args: Array[String]) {
    println("### Exercises 1 ###")
    println(values(x => x * x, -5, 5))

    println("\n### Exercises 2 ###")
    println(largestElement(Array(10, 200, 1, -3, 5, 9)))

    println("\n### Exercises 3 ###")
    println(factorialNoLoop(5))
  }
}

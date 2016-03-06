/**
  * Created by jimin on 2/19/16.
  *
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

  /**
    * Exercise 5
    *
    * @param fun
    * @param inputs
    * @return
    */
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs.map(fun).reduceLeft(_ max _)
  }

  /**
    * Exercises 6
    *
    * @param fun
    * @param inputs
    * @return
    */
  def largestAt(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs(inputs.map(fun).zipWithIndex.max._2)
  }

  /**
    * Exercises 7
    *
    * @param fun
    * @return
    */
  def adjustToPair(fun: (Int, Int) => Int): ((Int, Int)) => Int = {
    case (input1, input2) => fun(input1, input2)
  }
  
  def main(args: Array[String]) {
    println("### Exercises 1 ###")
    println(values(x => x * x, -5, 5))

    println("\n### Exercises 2 ###")
    println(largestElement(Array(10, 200, 1, -3, 5, 9)))

    println("\n### Exercises 3 ###")
    println(factorialNoLoop(5))

    println("\n### Exercises 5 ###")
    println(largest(x => 10 * x - x * x, 1 to 10))

    println("\n### Exercises 6 ###")
    println(largestAt(x => 10 * x - x * x, 1 to 10))

    println("\n### Exercises 7 ###")
    println(adjustToPair(_ * _)(9, 10))
  }
}

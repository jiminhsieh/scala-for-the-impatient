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

  def main(args: Array[String]) {
    println("### Exercises 1 ###")
    println(values(x => x * x, -5, 5))
  }
}

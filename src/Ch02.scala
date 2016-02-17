/**
  * Created by jimin on 2/16/16.
  */
object Ch02 {

  /**
    * Exercise 1
    *
    * @param x Int
    * @return
    */
  def signum(x: Int) = {
    if (x > 0) 1
    else if (x < 0) -1
    else 0
  }

  /**
    * ### Exercise 5 ###
    *
    * @param n
    */
  @annotation.tailrec
  def countdown(n: Int): Unit = {
    if (n >= 0) {
      println(n)
      countdown(n - 1)
    } else {}
  }

  /**
    * ### Exercise 6 ###
    *
    * @param str
    * @return
    */
  def stringToUnicode(str: String): String = {
    var result: Long = 1
    for (i <- str) {
      result *= i.toLong
    }
    result.toString ++ "L"
  }

  def main(args: Array[String]) {

    println("### Exercise 1 ###")
    println(signum(0))
    println(signum(-99))
    println(signum(100))

    println("\n### Exercise 4 ###")
    for (i <- 10 to 0 by -1) {
      println(i)
    }

    println("\n### Exercise 5 ###")
    countdown(11)

    println("\n### Exercise 6 ###")
    println(stringToUnicode("Hello"))

  }

}

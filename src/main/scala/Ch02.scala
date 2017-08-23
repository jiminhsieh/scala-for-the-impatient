/**
  * Created by jimin on 2/16/16.
  *
  * Control Structures and Functions
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

}

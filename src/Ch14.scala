/**
  * Created by jimin on 2/14/16.
  */
object Ch14 {

  /**
    * Exercise 2
    *
    * @param pair
    * @return
    */
  def swap(pair: (Int, Int)): (Int, Int) = pair match {
    case (x, y) => (y, x)
  }

  /**
    * Exercise 3
    * @param array
    * @return
    */
  def swap(array: Array[Int]): Array[Int] = array match {
    case Array(x, y, other @ _*) => Array(y, x) ++ other
    case _ => array
  }

  def main(args: Array[String]) {

    println("### Exercises 2 ###")
    val x = (10, 100)
    val y = swap(x)
    println(x)
    println(y)

    println("\n### Exercises 3 ###")
    val a = Array(1, 2, 3, 4, 5)
    val b = swap(a)
    println(a.mkString(" "))
    println(b.mkString(" "))

  }

}

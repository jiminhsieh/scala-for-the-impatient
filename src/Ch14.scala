/**
  * Created by jimin on 2/14/16.
  */
object Ch14 {

  /**
    * Exercises 2
    *
    * @param pair
    * @return
    */
  def swap(pair: (Int, Int)): (Int, Int) = pair match {
    case (x, y) => (y, x)
  }

  def main(args: Array[String]) {

    // Exercises 2.
    val x = (10, 100)
    val y = swap(x)
    println(x)
    println(y)
  }

}

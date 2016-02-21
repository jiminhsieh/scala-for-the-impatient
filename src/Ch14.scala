/**
  * Created by jimin on 2/14/16.
  */
object Ch14 {

  abstract class Item

  case class Article(description: String, price: Double) extends Item

  case class Bundle(description: String, discount: Double, item: Item*) extends Item

  case class Multiple(num: Integer, item: Item) extends Item

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
    *
    * @param array
    * @return
    */
  def swap(array: Array[Int]): Array[Int] = array match {
    case Array(x, y, other@_*) => Array(y, x) ++ other
    case _ => array
  }

  /**
    * Exercise 4
    *
    * @param item
    * @return
    */
  def price(item: Item): BigDecimal = item match {
    case Article(_, cost) => BigDecimal(cost)
    case Bundle(_, discount, rest@_*) => rest.map(price(_)).sum - discount
    case Multiple(num, item) => price(item) * BigDecimal(num)
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

    println("\n### Exercise 4 ###")
    val item = Bundle("Father's day special", 20.0,
      Multiple(1, Article("Scala for the Impatient", 39.95)),
      Bundle("Anchor Distillery Sampler", 10.0,
        Article("Old Potrero Straight Rye Whiskey", 79.95),
        Article("Junípero Gin", 32.95)
      )
    )
    println(price(item))

  }

}

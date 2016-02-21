/**
  * Created by jimin on 2/21/16.
  */
object Ch04 {

  def main(args: Array[String]) {

    println("### Exercise 1 ###")
    val gizmosPrices = Map("A" -> 10, "B" -> 5,  "C" -> 3)
    val gizmosPricesWithExtra = gizmosPrices.mapValues(_ * BigDecimal(1.1))
    println(gizmosPricesWithExtra)
  }

}

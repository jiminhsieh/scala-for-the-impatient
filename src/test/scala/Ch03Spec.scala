import org.scalatest.FlatSpec
import Ch03._

class Ch03Spec extends FlatSpec {
  /**
    * Exercise 2
    */
  "After swapArray" should "equal Array(2, 1, 4, 3, 5)" in {
    assert(swapArray(Array(1, 2, 3, 4, 5)).deep == Array(2, 1, 4, 3, 5).deep)
    //assert(swapArray(Array(1, 2, 3, 4, 5)).sameElements(Array(2, 1, 4, 3, 5)))
  }

  /**
    * Exercise 3
    */
  "After swapArrayYield" should "equal Array(2, 1, 4, 3, 5)" in {
    //assert(swapArray(Array(1, 2, 3, 4, 5)).deep == Array(2, 1, 4, 3, 5).deep)
    assert(swapArrayYield(Array(1, 2, 3, 4, 5)).sameElements(Array(2, 1, 4, 3, 5)))
  }

  /**
    * Exercise 5
    */
  "Average of Array[Double]" should "equal 2d" in {
    assert(average(Array(1d, 2d, 3d)) == 2d)
  }

}

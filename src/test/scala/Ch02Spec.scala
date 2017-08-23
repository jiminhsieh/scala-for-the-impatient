import org.scalatest.FlatSpec
import Ch02._

class Ch02Spec extends FlatSpec {


  /**
    * Exercise 1
    */
  "10" should "return 1" in {
    assert(signum(10) == 1)
  }

  "-5" should "return -1" in {
    assert(signum(-5) == -1)
  }

  "0" should "return 0" in {
    assert(signum(0) == 0)
  }

  /**
    * Exercise 6
    */
  "Unicode of Hello" should "equal to 9415087488L" in {
    assert(stringToUnicode("Hello") == "9415087488L")
  }

}

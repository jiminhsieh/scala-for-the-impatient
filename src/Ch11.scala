/**
  * Created by jimin on 3/9/16.
  */
object Ch11 {

  /**
    * ### Exercises 3 ###
    *
    * @param n
    * @param d
    */
  class Fraction(n: Int, d: Int) {
    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

    override def toString = num + "/" + den

    def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0

    def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

    def abs(a: Int) = sign(a) * a

    def /(that: Fraction): Fraction =
      new Fraction(this.num * that.den, this.den * that.num)

    def *(that: Fraction): Fraction =
      new Fraction(this.num * that.num, this.den * that.den)

    def +(that: Fraction): Fraction =
      new Fraction(this.num * that.den + that.num * this.den, this.den * that.den)

    def -(that: Fraction): Fraction =
      new Fraction(this.num * that.den - that.num * this.den, this.den * that.den)
  }

  /**
    * ### Exercises 4 ###
    *
    * @todo refactor
    * @param d
    * @param c
    */
  class Money(d: Int, c: Int) {
    val dollar = d
    val cent = c

    override def toString = dollar + "." + cent

    def +(that: Money): Money = {
      new Money(this.dollar + that.dollar + ((this.cent + that.cent) / 100), (this.cent + that
        .cent) % 100)
    }

    def -(that: Money): Money = {
      val cent = (this.dollar * 100 + this.cent) - (that.dollar * 100 + that.cent)
      cent match {
        case 0 => new Money(0, 0)
        case n if n < 0 && (n / 100 != 0) => new Money(cent / 100, -(cent % 100))
        case _ => new Money(cent / 100, cent % 100)
      }
    }

    def <(that: Money): Boolean = {
      if (that.dollar > this.dollar || (that.dollar == this.dollar && that.cent > this.cent)) true
      else false
    }

    def ==(that: Money): Boolean = {
      if (that.dollar == this.dollar && that.dollar == this.dollar) true
      else false
    }
  }

  def main(args: Array[String]) {

    println("### Exercises 3 Sample Value 1 ###")
    val x1 = new Fraction(1, 4)
    val x2 = new Fraction(1, 2)
    println(x1 / x2)
    println(x1 * x2)
    println(x1 + x2)
    println(x1 - x2)

    println("\n### Exercises 3 Sample Value 2 ###")
    val y1 = new Fraction(-5, 3)
    val y2 = new Fraction(5, 6)
    println(y1 / y2)
    println(y1 * y2)
    println(y1 + y2)
    println(y1 - y2)

    println("\n### Exercises 4 Sample Value 1 ###")
    val money1 = new Money(7, 35)
    val money2 = new Money(6, 50)
    println(money1 + money2)
    println(money1 - money2)
    println(money1 < money2)
    println(money1 == money2)

    println("\n### Exercises 4 Sample Value 2 ###")
    println(money2 + money1)
    println(money2 - money1)
    println(money2 < money1)
    println(money2 == money1)

    println("\n### Exercises 4 Sample Value 3 ###")
    val money3 = new Money(8, 50)
    println(money3 + money3)
    println(money3 - money3)
    println(money3 < money3)
    println(money3 == money3)
  }
}

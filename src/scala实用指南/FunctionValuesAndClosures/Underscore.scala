package scala实用指南.FunctionValuesAndClosures

class Underscore {
  val arr = Array(1, 2, 3, 4, 5)
  val total = (0 /: arr) { (sum, elem) => sum + elem }
  println(total)
  val total2 = (0 /: arr) {
    _ + _
  }
  println(total2)

  val arrExists = arr.exists(elem => elem < 4)
  val arrExists2 = arr.exists(_ < 4)
  println(arrExists)
  println(arrExists2)
}

object Underscore {
  def main(args: Array[String]): Unit = {
    new Underscore
  }
}

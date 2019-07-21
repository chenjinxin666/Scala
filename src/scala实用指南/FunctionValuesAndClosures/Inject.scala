package scala实用指南.FunctionValuesAndClosures

class Inject {
  val array = Array(2, 3, 5, 1, 6, 4)

  val sum = array.foldLeft(0) { (sum, elem) => sum + elem }
  val max = array.foldLeft(Integer.MIN_VALUE) {
    (large, elem) => Math.max(large, elem)
  }

  val sum2 = (0 /: array) ((sum, elem) => sum + elem)
  val max2 = (Integer.MIN_VALUE /: array) { (large, elem) => Math.max(large, elem) }

  println(s"Sum : $sum")
  println(s"Max : $max")
  println(s"Sum2 : $sum2")
  println(s"Max2 : $max2")

  //  val max3 = (Integer.MIN_VALUE /: array) { (large, elem) => Math.max(large, elem) }
  val max3 = (Integer.MIN_VALUE /: array) {
    Math.max(_, _)
  }
  println(s"max3 : $max3")
  val max4 = (Integer.MIN_VALUE /: array) {
    Math.max _
  }
  println(s"max4 : $max4")
  val max5 = (Integer.MIN_VALUE /: array) {
    Math.max
  }
  println(s"max5 : $max5")
}

object Inject4 {

  def main(args: Array[String]): Unit = {
    new Inject
  }
}
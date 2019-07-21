package scala实用指南.FunctionValuesAndClosures

object Closure extends App {
  def loopThrough(number: Int)(closure: Int => Unit): Unit = {
    for (i <- 1 to number) {
      closure(i)
    }
  }

  var result = 0
  val addIt = { value: Int => result += value }
  loopThrough(10) { elem => addIt(elem) }
  println(s"values1 : $result")
  result = 0
  loopThrough(5) {
    addIt
  }
  println(s"values2 : $result")

  result = 1
  loopThrough(5) {
    result *= _
  }
  println(s"values3 : $result")
}

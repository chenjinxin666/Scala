package day04.bound

class UpperBound[T <: b1a1] {
  def say(p: T): Unit = {
    println(p.getClass)
  }
}

object UpperBound {
  def main(args: Array[String]): Unit = {
    val a =new UpperBound[c1b1]
    a.say(new c1b1)
  }
}

package day04.matchCase

object caseFun {
  def f1: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case _ => "nil"
  }
  def f2(num:Int) : String = num match{
    case 1 => "one"
    case 2 => "two"
    case _ => "nil"
  }

  def main(args: Array[String]): Unit = {
    println(f1(1))
    println(f1(2))
    println(f1(3))
    println(f2(1))
    println(f2(2))
    println(f2(3))
  }
}

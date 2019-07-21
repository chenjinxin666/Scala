package scala.day03

trait TraitDemo01_03{
  def say={
    println("hello world！")
  }
}

class  Boy(val name:String, var age:Int)

object Boy {
  def main(args: Array[String]): Unit = {
    val b1 = new Boy("熊大", 8)

    val b2 = new Boy("熊二", age = 7) with TraitDemo01_03
    b2.say
  }
}

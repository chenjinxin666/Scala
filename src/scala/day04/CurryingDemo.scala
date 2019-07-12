package main.scala.day04

/**
  * 柯里化
  */
object CurryingDemo {

  /**
    * 普通的方法
    * @param x
    * @param y
    * @return
    */
  def add(x:Int, y:Int) ={
    x+y
  }

  /**
    * 柯里化方法
    * @param x
    * @param y
    * @return
    */
  def add2(x:Int)(y:Int) ={
    x+y
  }

  def main(args: Array[String]): Unit = {
    println(add(2,6))

    //val result = add2(2)(6)
    val result = add2(2) _
    val sum = result(6)
    println(sum)
  }
}

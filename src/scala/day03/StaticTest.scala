package main.scala.day03

/**
  * 实现一个单例模式
  * 不对外提供直接的访问
  */
class StaticTest {
  private def add(x:Int, y:Int) = {
    x + y
  }
}

/**
  * 这个是单例模式的定义，和类名相同，且不带参数
  */
object  StaticTest {
  //声明一个staticTest的实例对象
  val staticTest = new StaticTest
  println("老娘说了算")

  def add(x:Int, y:Int) = {
    staticTest.add(x, y)
  }
}

object StaticTest2{
  def main(args: Array[String]): Unit = {
    //第一个问题：
    StaticTest.add(2,3)
    StaticTest.add(3,3)
    StaticTest.add(4,3)
    StaticTest.add(5,3)

    println(DateUtils.getCurrentDate)
    println(DateUtils.getCurrentTime)
  }
}



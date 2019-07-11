package day04.generic_

/**
  * 定义一个泛型类
  */
class GenericClass[A] {
  //声明一个变量，该变量是一个泛型类型，程序运行时确定参数类型
  private var context:A =_
  def setContext(value:A):Unit={
    context = value
    println(value.getClass)
  }
  def getContext()={
    context
  }
}
object GenericClassTest{
  def main(args: Array[String]): Unit = {

    val intObj = new GenericClass[Int]
    intObj.setContext(1)

    val strObj = new GenericClass[String]
    strObj.setContext("hello")

    new GenericClass[Double].setContext(2)
  }
}



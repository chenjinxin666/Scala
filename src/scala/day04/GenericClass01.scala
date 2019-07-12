package main.scala.day04

class GenericClass01 {
  private var context = 100
  def setContext(value:Int):Unit={
    context = value
  }
  def getContext()={
    context
  }
}
class GenericClass02 {
  private var context = "abc"
  def setContext(value:String):Unit={
    context = value
  }
  def getContext()={
    context
  }
}

/**
  * 定义一个泛型类
  */
class GenericClass[A2A] {
  //声明一个变量，该变量是一个泛型类型，程序运行时确定参数类型
  private var context:A2A =_
  def setContext(value:A2A):Unit={
    context = value
  }
  def getContext()={
    context
  }
}
object GenericClassTest{
  def main(args: Array[String]): Unit = {
    val generic01 = new GenericClass01
    generic01.setContext(1)

    val generic02 = new GenericClass02
    generic02.setContext("hello")

    val intObj = new GenericClass[Int]
    intObj.setContext(1)

    val strObj = new GenericClass[String]
    strObj.setContext("hello")
  }
}



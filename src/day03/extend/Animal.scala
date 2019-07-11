package day03.extend

abstract class Animal {
  //抽象字段
  var age:Int

  //非抽象字段
  val weight:Double = 35

  //抽象方法，没有具体的实现
  def color()

  //非抽象方法，有具体的实现
  def eat(): Unit ={
    println("吃食物")
  }
  //使用final关键字，标示不能重写，override
  //使用final关键字，必须有具体的实现
  final def action()= {
    println("跳跃/爬树")
  }
}
class Monkey extends Animal{
  var age: Int = 2

  def color(): Unit = {
    println("color imp")
  }

  override val weight: Double = 100

  override def eat(): Unit = {
    println("eat override")
  }
}
object Monkey{
  def main(args: Array[String]): Unit = {
    val m=new Monkey
    m.color()
    m.eat()
    println(m.age)
    println(m.weight)
  }
}

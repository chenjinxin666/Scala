package main.scala.day03

/**
  * d定义一个抽象类，用于继承
  */
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

/**
  * 如果想要实现父类的方法：CTRL+I
  * 如果想要重写父类的方法：CTRL+O
  */
class  Monkey extends Animal{

  //重写父类的字段(父类没有具体的实现)，可以选择性的使用override
  var age: Int = 3
  //非抽象字段，父类有具体的实现，一定要加override
  override val weight: Double = 40

  //非抽象方法有具体的实现，（重写父类费抽象方法，必须使用override）
  override def eat(): Unit = super.eat()

  //抽象方法，没有实现（重写父类抽象的方法，可以选择性的使用override）
  def color(): Unit ={
    println("棕色")
  }

}

object Monkey{
  def main(args: Array[String]): Unit = {
    val monkey = new Monkey
    monkey.color

    println(monkey.age)
    println(monkey.weight)
  }
}



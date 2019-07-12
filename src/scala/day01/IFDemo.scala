package main.scala.day01

/**
  * IF条件表达式的Demo
  */
object IFDemo {

  def main(args: Array[String]): Unit = {
    //在scala中不需要添加分号作为语句块的结束符
    val num = 20

    //在scala中if else语句是有返回值的
    if(num>20) println("我成年了") else println("我不能早恋")

    //在scala中if else语句是有返回值的，返回值就是最后一条语句的返回值, 如果返回值类型不一样的话，那么返回值的类型是any类型，any类型类似于java的object类型
    val str = if(num<20) "未成年人"
    else 1221

    //如果ifelse语句缺省了else语句块，那么默认是没有返回值的，再java中void标示没有返回值，再scala中unit标示没有返回值，Unit用"()"标示
    val str2 = if(num>20) "成年人" else  {}

    println(str)

  }
}

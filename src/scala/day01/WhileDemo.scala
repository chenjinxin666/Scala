package main.scala.day01

import scala.util.control.Breaks._
/**
  * while循环Demo
  */
object WhileDemo {
  def main(args: Array[String]): Unit = {
    var num = 0
    do{
      //至少执行一次
      println(num)
      num += 1
    }while(num<=5)

    var num2 = 0

    //使用breakable方法跳出while循环
    breakable({
      while (true){
        num2+=1
        if(num2>5){
          break()
        }
        println(num2)
      }
    })

    var flag = true
    while (flag){
      if(num2>10)
        flag = false
      println(num2)
    }

    //for推导式：如果for循环的循环体以yield开始，则该循环会构建出一个集合
    //每次迭代生成集合中的一个值
    val v = for (i <- 1 to 10) yield i * 10
    println(v)
  }
}

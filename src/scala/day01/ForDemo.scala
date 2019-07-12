package main.scala.day01

import  scala.util.control.Breaks._

/**
  * for循环demo
  */
object ForDemo {
  def main(args: Array[String]): Unit = {

    //左闭右合
    // 使用to方法会产生一个连续不断的区间范围， 【0-10】左右两边都包含
    for(i <- 0 to 10) println(i)

    //左闭右开
    for (i<- 0  until 10 ) println(i)

    //遍历一个字符串
    for (i<- "abcde") println(i)

    println("*****************九九乘法表******************************")
    for(i<-1 to 9) {
      for (j <- 1 to i) {
        if (i == j) {
          println(i + "*" + j + "=" + i * j)
        } else {
          print(j + "*" + i + "=" + i * j + "\t")
        }
      }
    }

    //多重for循环
    for(i<-1 to 9 ; j <- 1 to i) {
      if (i == j) {
        println(i + "*" + j + "=" + i * j)
      } else {
        print(j + "*" + i + "=" + i * j + "\t")
      }
    }

    //带有if守卫条件的for循环
    for (i<- 0  to 10; if(i%2==0)) println(i)

    println("***************************")
    var flag = false

    for (i<-0 to 10 ; if(!flag)){
      println(i)
      if(i>=5) flag = true
    }

    breakable({
      for (i<- 0 to 10){
        println(i)
        if(i>=5) break()
      }
    })

    println("end......")

    //跳出循环的三种方式：
    //1：声明一个外部变量
    //2：使用breakable
    //3: 使用嵌套函数
  }
}

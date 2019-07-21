package scala.day04

/**
  * 将一种数据类型转换成另外一种数据类型，同时有了另外一种数据类型的方法和属性，可以认为是对类的一种增强
  * 隐式转换分为两种
  * 1：隐式转换值
  * 2：隐式转换函数
  * 3：隐式转换方法
  *
  * 定义隐式转换的关键字都是implicit
  * 默认的转换命名格式是：int2String
  * 案例：火车站购票
  */
//特殊人群
class SpecialPerson(var name:String, var age:Int)

//老人
class Older(var name:String)

//学生
class Student04(var name:String)

//教师
class Teacher04(var name:String)

object ImplicitDemo {

  /**
    * 特殊人群购票窗口
    * @param p
    */
  def buySpecialTickerWindow(p:SpecialPerson)={
    if(p== null){
      println("您不是特殊人群，请走正常窗口购票!")
    }else{
      println(s"${p.name} 年龄：${p.age}, 购买了一张特殊票！")
    }
  }

  def main(args: Array[String]): Unit = {
    //val older = new Older("曹展")
    val student = new Student04("鹏鹏")
    //val teacher = new Teacher04("苍老师")

    import MyPredef._
    buySpecialTickerWindow(student)
  }
}

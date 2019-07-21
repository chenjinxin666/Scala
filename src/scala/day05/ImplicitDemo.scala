package scala.day05

/**
  * 隐式转换：
  *   隐式转换参数
  *   隐式转换方法
  *   隐式转换函数
  *   隐式类: 只能在静态对象中使用
  */

object ImplicitDemo {

  /**
    * 定义一个隐式转换方法，将double转换成int
    * @param x
    * @return
    */
  implicit def double2Int(x:Double):Int = {
    println("方法起作用了")
    x.toInt
  }

  /**
    * 定义一个隐式转换函数，将double转换成int
    */
  implicit val funDouble2Int = (x:Double)=> {
    println("函数起作用了")
    x.toInt
  }

  /**
    * 定义一个隐式转换函数，将 Int 转换成 String
    */
  implicit val funDouble2Int2 = (x:Int)=> {
    println("函数起作用了2")
    x.toString
  }

  /**
    * 隐式类，只能用在静态对象中————用来包裹方法
    按照变量的数据类型和隐式类的的参数类型匹配隐式类，调用该类的方法
    * @param name
    */
  implicit class Teacher(name:String){
    def say = { s"hello ${name}" }
    def age:String= {"my age 12"}
  }

  implicit class Student(age:Int){
    def say = { s"age ${age}" }
  }

  def main(args: Array[String]): Unit = {
    //定义一个变量
    val age :Int = 23.0
    val sex: String = 111

    println(age)

    val cang = "苍老师"
    println(cang.say)
    println(cang.age)

    println(age.say)
  }
}

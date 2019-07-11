package day05

/**
  * 隐式转换：
  * 隐式转换参数
  * 隐式转换方法
  * 隐式转换函数
  * 隐式类: 只能在静态对象中使用
  */
object ImplicitDemo {
  /* 隐式转换方法*/
  implicit def mDouble2String(d: Double) = {
    println("def double2String " + d.getClass)
    d.toString
  }

  implicit def mString2Double(s: Double) = {
    println("def string2Double " + s.getClass)
    s.toInt
  }

  //隐式转换函数——函数优先级大于方法
  implicit val fDouble2String=(d: Double) => {
    println("val double2String " + d.getClass)
    d.toString
  }

  implicit val fString2Double= (s: Double) => {
    println("val string2Double " + s.getClass)
    s.toInt
  }

  //隐式类
  implicit class A(x:Int){
    def whatClass={x.getClass}
    def whatValue={x}
  }
  implicit class B(x:String){
    def whatClass={x.getClass}
    def whatValue={x}
  }
  def main(args: Array[String]): Unit = {
    val d: Int = 1.2
    val s: String = 1.2
    println(d)
    println(s)

    println(d.whatClass)
    println(d.whatValue)
    println(s.whatClass)
    println(s.whatValue)

  }
}

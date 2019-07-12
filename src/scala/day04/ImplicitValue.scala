package main.scala.day04

object ImplicitValue {
  implicit val z: Int = 100
  //implicit val h:Int = 200
//  implicit val y:Int = 300

  /**
    * implicit隐式的，用implicit隐式的修饰的变量叫做隐式变量
    * 柯里化方法
    * @param x
    * @param y
    */
  def test(x:Int)(implicit y:Int = 200) ={
    println(x+y)
  }

  def main(args: Array[String]): Unit = {
    //方法在执行时，发现需要一个隐式的Int类型的参数, 就会在方法执行的环境中（context）中找跟方法中以来的隐式变量类型一致的参数
    //如果找到了，就直接使用，没有找到的话
    //优先级：传入>上下文类型一致的隐式值>默认值
    test(1)(300)
  }
}

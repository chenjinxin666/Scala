package day04.implicitVF

object ImplicitValue {
  implicit val z: Int = 100

  def test(x: Int)(implicit y: Int = 10) = {
    println(x + y)
  }

  def main(args: Array[String]): Unit = {
    //优先级：传入>上下文类型一致的隐式值>默认值
    test(1)(10)//11
    test(1)//101
    test(1)()//11-传入第二个空参数参数时使用默认参数
  }
}

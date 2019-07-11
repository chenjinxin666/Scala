package day03.apply

class MyGril {
  private var name = "苍井空"
  //输出的是伴生对象的name
  println(MyGril.name)
}
object MyGril{
  private var name = "波多野结衣"
  // 输出的是他半生类name
  println(new MyGril().name)

  def apply(name:String)={
    println(s"object:${name}")
  }
}
object testMyGril{
  def main(args: Array[String]): Unit = {
    var gr=MyGril("小泽玛利亚")
    val gl=MyGril("长泽锌")
  }
}
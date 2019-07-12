package main.scala.day03

class MyGril {
  private var name = "苍老师"
  //输出的是他伴生对象的name
  println(MyGril.name)
}
object MyGril {
  private var name ="波多老师"
//  val gril = new MyGril
//  println(gril.name)
  //等同于
  // 因为伴生类中打印了伴生对象的name，所以伴生类先打印，然后在执行伴生对象的输出
  // 输出的是他半生类name
  println(new MyGril().name)

  def apply(name:String): Unit = {
    println(s"女神：${name}")
  }
}

object testMyGril{
  def main(args: Array[String]): Unit = {
    var gril1 = MyGril("小泽老师")
    val gril2 = MyGril("长泽梓老师")

    //1：苍老师
    //2: 波多老师
    //3: 女神：小泽老师
    //4: 女神：长泽梓老师

    //1：波多老师
    //2: 苍老师
    //3: 女神：小泽老师
    //4: 女神：长泽梓老师

    //1：苍老师
    //2: 波多老师
    //3: 女神：小泽老师
    //4: 波多老师
    //5: 女神：长泽梓老师


  }
}

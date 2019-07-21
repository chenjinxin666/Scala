package scala.day04

abstract class Element {
  def demo() = {
    println("Element invoked")
  }
}
class  ArrayElement extends  Element{
  override def demo(): Unit = {
    println("ArrayElement invoked")
  }
}
class LineElement extends ArrayElement{
  override def demo(): Unit = {
    println("LineElement invoked")
  }
}
class UniforElement extends  Element  //没有实现父类的方法

object ElementTest{
  //参数类型是祖宗类，任何子类实例化都需要传递（基类）
  def invoked(e:Element) ={
    e.demo()//多态，在运行时调用相应子类的方法
  }

  def main(args: Array[String]): Unit = {
    invoked(new ArrayElement)   //父类引用指向子类对象
    invoked(new LineElement)    //祖父类引用指向孙类对象
    invoked(new UniforElement)  //没有重写父类的方法，所以调用的时候输出祖宗类demo方法
  }
}
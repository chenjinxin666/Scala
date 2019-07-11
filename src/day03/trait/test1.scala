package day03.`trait`

trait test1 {
  //使用val修饰的非抽象字段，可以被重写
  val name:String = "熊大"

  //使用var修饰的非抽象字段，不能被重写
  var age:Int = 23

  //抽象字段，不管是使用val还是var，都需要被重写
  var sex :String

  //抽象方法
  def say(context:String)
}
trait test2 {
  //抽象方法
  def sayHello(context:String)
}

class Trait1 extends test1 with test2{
  override val name: String = "xiong"
  var sex: String = "m"

  def say(context: String): Unit = {
    println(context)
  }

  def sayHello(context: String): Unit = {
    println(context)
  }
}
object Trait1{
  def main(args: Array[String]): Unit = {
    val T = new Trait1()
    T.say("say")
    T.sayHello("hello")
    println(T.name)
    println(T.sex)
  }
}